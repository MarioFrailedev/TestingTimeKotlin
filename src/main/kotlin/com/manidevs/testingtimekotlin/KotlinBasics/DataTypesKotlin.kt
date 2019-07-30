package com.manidevs.testingtimekotlin.KotlinBasics

fun main (args : Array<String>){
    //Basic Kotlin data types used for numbers are equivalents of Java numeric primitives

/*The first difference is that there are no implicit conversions for numbers--smaller types are not
implicitly converted to bigger types*/

    var weight = 12
//var truckWeight: Long = weight error
//fix the problem
    var truckweight: Long = weight.toLong()
    println(truckweight)

    //char type
    val char = 'a'    // 1 char
    val string = "a"  // 2 String
    println("This is the char \'$char\' and this is string \"$string\"  :)")

    //arrays
    val array = arrayOf(1,2,3)   // inferred type Array<Int>
    array.forEach(System.out::print)
    println()
    //val array2: Array<Short> = arrayOf(4,5,6)
    //val array3: Array<Long> = arrayOf(7,9,9)
    val array4 = Array(5){ it * 2 }
    array4.forEach(System.out::println)

    //boleans
    //val isGrowing: Boolean = true
    //val isGrowing2: Boolean? = null

    //Strings
    val str = "abcd"
    println(str[1])
    println(str.reversed())
    println(str.takeLast(2))

    println("john@test.com".substringBefore("@")) // Prints: john
    println("john@test.com".startsWith("@")) // Prints: false

    //string template
    val name = "Eva"
    val age = 27
    val message = "My name is $name and I am $age years old"
    println(message)

    //Range
    for (i in 1..5) print(i) // Prints: 1234
    for (i in 'b'..'g') print(i) // Prints: bcdefg

    //if statement is a expresionn
    val n = 5
    if(n > 10)
        print("Greather")
    else
        print("smaller")

    //if as an expresion
    println(if(n > 10)"greather" else "smaller")

    val hour = 10
    val greeting: String
    if (hour < 18) {
        greeting = "Good day"
    } else {
        greeting = "Good evening"
    }
    println(greeting)

    //if expresion to a grating variable
    val greatingE = if (hour < 18) "Good day " else "Good evening"
    println(greatingE)

    //sometime we need to configure code inside of one the branch
    val greathingECode = if (hour < 18){
        //some code
        "Good day"
    }else{
        //some other code
        "Good evening"
    }
    println(greathingECode) // Prints: "Good day"

    val message2 = "You are ${ if (age < 18) "young" else "of age" } person"
    println(message2) // Prints: You are of age person

    //the when expresion
    val x = 2
    when(x){
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> println("X is neither 1 nor 2")
    }

    //when as expresion
    val vehicle = "Bike"

    val messagev= when (vehicle) {
        "Car" -> {
            // Some code
            "Four wheels"
        }
        "Bike" -> {
            // Some code
            "Two wheels"
        }
        else -> {
            //some code
            "Unknown number of wheels"
        }
    }

    println(messagev) //Prints: Two wheels






}
