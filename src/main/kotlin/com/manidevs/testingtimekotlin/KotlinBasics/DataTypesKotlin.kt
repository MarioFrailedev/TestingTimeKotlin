package com.manidevs.testingtimekotlin.KotlinBasics

fun main (args : Array<String>){
    //Basic Kotlin data types used for numbers are equivalents of Java numeric primitives

/*The first difference is that there are no implicit conversions for numbers--smaller types are not
implicitly converted to bigger types*/

    var weight: Int = 12
//var truckWeight: Long = weight error
//fix the problem
    var truckweight: Long = weight.toLong()
    println(truckweight)

    //char type
    val char = 'a'    // 1 char
    val string = "a"  // 2 String
    println("This is the char $char and this is string $string :)")

    //arryas
    val array = arrayOf(1,2,3)   // inferred type Array<Int>
}
