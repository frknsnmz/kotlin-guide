package section05

import javacode.section5practice.Bicycle

fun main(args: Array<String>) {
    val bicycle = KotlinBicycle(10,10,10)
    bicycle.printDescription()

    val mountainBike = KotlinMountainBike(1,2,3,4)
    mountainBike.printDescription()

    val roadBike = KotlinRoadBike(1,2,3,4)
    roadBike.printDescription()

    //************

    val bicycle2 = KotlinBicycle(10,10)
    bicycle2.printDescription()

    val mountainBike2 = KotlinMountainBike(1,2,3)
    mountainBike2.printDescription()

    val roadBike2 = KotlinRoadBike(1,2,3)
    roadBike2.printDescription()


    val mountainBike3 = KotlinMountainBike(1,2,3, color ="blue")
    mountainBike3.printDescription()

    KotlinMountainBike.avaliableColor.forEach{ println(it) }


}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear")
    }
}

class KotlinMountainBike(var seatHeight:Int, cadence: Int, speed: Int, gear: Int = 10):
    KotlinBicycle(cadence, speed, gear) {

    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10, color: String):
            this(seatHeight, cadence, speed, gear) {
        println("this is the color $color")
    }

    companion object {
        val avaliableColor = listOf("blue", "purple", "yellow")
    }

    override fun printDescription() {
        super.printDescription()
        println("seat height: $seatHeight")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10):
        KotlinBicycle(cadence, speed, gear){


        }