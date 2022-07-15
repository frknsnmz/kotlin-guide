package section05

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyRightLine())
    println(SomeClass.SomeCompanion.accesPrivateVar())
    println(SomeClass.accesPrivateVar()) // also possible but its not good in my opinion

    val someClass1 = SomeClass.SomeCompanion.justAssign("ABscsw")
    val someClass2 = SomeClass.SomeCompanion.upperOrLower("qsdqs", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantsSomeInterface(object: SomInterface {
        override fun mustImplemented(num: Int): String {
            thisIsMutable++
            return "this is from must implement: ${num*10}"
        }
    })
    println(thisIsMutable) // 46


    println(Department.ACCOUNTING.getDepartmentInfo())

}

enum class Department(val fullName: String, val numEmployess: Int) {
    HR("Human resource", 10), IT("sd",2),
    ACCOUNTING("asd",4);

    fun getDepartmentInfo() = "qwdq $fullName deqwdq $numEmployess"
}

fun topLevel(str: String) = println("Toplevel func: $str")

object CompanyCommunications {
    val currentYear = Year.now().value
    fun getTagLine() = "Rocks"
    fun getCopyRightLine() = "$currentYear all right reserved"

}

class SomeClass private constructor(val someString: String) {

    companion object SomeCompanion{
        private var privateVar = 6
        fun accesPrivateVar() = "I'm accesing: $privateVar "

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLower(str:String, lowerCase: Boolean): SomeClass {
            if(lowerCase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}

interface SomInterface {
    fun mustImplemented(num:Int): String
}

fun wantsSomeInterface(si: SomInterface) {
    println("print some interface ${si.mustImplemented(22)}")
}