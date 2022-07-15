package anotherpackage

import section05.topLevel
import section05.CompanyCommunications as Com

fun main(args: Array<String>) {
    topLevel("Hello");
    println(Com.getTagLine())
}