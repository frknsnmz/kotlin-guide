package section06.kotlincode06

fun main(args: Array<String>) {

    // 5 , 10, 15, 20, 25 ...5000
    for (i in 5..5000 step 5) {
        println(i)
    }

    for (i in -500..0) {
        println(i)
    }

    // 0, 1, 1, 2, 3, 5 ...
    var total: Int
    var secondToLast = 0
    var last = 1
    println(secondToLast)
    println(last)
    for (i in 1..13) {
        total = secondToLast + last
        println(total)
        secondToLast = last
        last = total
    }

    for (i in 1..5) {
        println(i)
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
            }
        }
    } // Change to -> 1, 11, 100, 99, 98,2

    // Solution
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    } // 1, 11, 100, 99, 98,2


    val num = 101
    val dnum = if (num < 100) {
        -234.546
    } else if (num > 100) {
        444.555
    } else {
        0
    }
    println(dnum)

    val dnum2 = when {
        num < 100 -> -234.546
        num > 100 -> 444.555
        else -> 0
    }
    println(dnum2)



}