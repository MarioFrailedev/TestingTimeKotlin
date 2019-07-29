package com.manidevs.testingtimekotlin.KotlinBasics

fun main(arg: Array<String>){

    val string1: String? = null
    val string2: String? = "ＳＨＯＷ　ＭＥ　ＷＨＡＴ　ＹＯＵ　ＧＯＴ!!!"

    //val length1: Int = if(string1 != null) string1.length else -1
    val length1: Int = string1 ?.length ?: -1
    //var length2: Int = if(string2 != null) string2.length else -1
    val length2: Int = string2 ?.length ?: -1

    println(length1)
    println(string1)
    println(length2)
    println(string2)

}