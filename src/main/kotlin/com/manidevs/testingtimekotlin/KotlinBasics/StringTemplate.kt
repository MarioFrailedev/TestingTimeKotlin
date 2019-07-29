package com.manidevs.testingtimekotlin.KotlinBasics

fun main (args: Array<String>){

    //lets explore spring template and interpolation
    var name = "Super"
    name = "Mario"

    var beerDrink: Int = 5 //mutable value
    val coverage: Float = 83.5F

    //The Architect Mario has secured 83.5 of coverage, he has to improve his coverage
    println("The Architec $name has secured $coverage he has to improve his code")

    val armagHEADdon = "Show me what you got"
    println("The length of the string is ${armagHEADdon.length}")

    var length = 10
    var breadth = 5
    println("The length is $length and breadth $breadth, hence the area is ${length * breadth}")

    //Explore IF ELSE conditional statements along with IF expressions to find our larger number
    val num = 90
    val num1 = 60

    val greaterNumber: Int

    if(num > num1) {
        print("is greater")
        greaterNumber = num
    }
    else{
        greaterNumber = num1
    }
    println("The final greater Number is $greaterNumber")

    //using IF expresion
    var bigNum: Int = if (num > num1){
                        print("num is greater ")
                            num
                        }else{
                        println("num1 is greater")
                             num1
                        }
    println("The final greater number is $bigNum")

}