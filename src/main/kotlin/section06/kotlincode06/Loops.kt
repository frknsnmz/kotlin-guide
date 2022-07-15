package section06.kotlincode06

fun main(args: Array<String>) {

    // for rangin value must be comparable
    val range = 1..5
    for (i in range) {
        println(i)
    }
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range) // true
    println('q' in charRange) // true
    println("CCC" in stringRange) // true
    println("CCCCCCC" in stringRange) // true
    println("ZZZZZ" in stringRange) // false

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    val stepRange = 3..15
    for (n in stepRange) {
        println(n)
    }
    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n) // 3'er 3'er basamakla yazar
    }
    val reversedRange = range.reversed()


    for (i in 1..5) {
        println(i)
    }

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 20 downTo 15) {
        println(i)
    }

    for (i in 20 downTo 15 step 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i) // 1 to 9
    }

    val s = "goodbye"
    val sRange = 0..s.length

    val seasons = arrayOf("spring", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    val notaSeason = "whaterever" !in seasons
    println(notaSeason) // true

//    for (i in 1..3) {
//        println("i = $i")
//        jloop@ for(j in 1..4) {
//            println("j = $j")
//        }
//            for (k in 5..10 ){
//                println("k is $k")
//                if (k == 7){
//                    break@jloop
//                }
//            }
//    }




}