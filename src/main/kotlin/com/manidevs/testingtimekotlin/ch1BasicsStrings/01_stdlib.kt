fun main(args: Array<String>) {
    val capitols = listOf("England" to "London", "Poland" to "Warsaw")

    val text = capitols.map { (country, _) -> country.toUpperCase() }
                       .onEach { println(it) } 
                       .filter { it.startsWith("P") } 
                       .joinToString (prefix = "Countries starting from P are: ") 
    // Prints: ENGLAND POLAND
    println(text) // Prints: Countries starting from P are POLAND

    val myFamilyMember = listOf("Wife" to "Angelica", "babyGril" to "Sofia", "babyGril" to "Nicole", "Me Dad" to "Mario")

    val names = myFamilyMember.map { (_, name) -> name.toUpperCase()  }
            .onEach { println(it) }
            .filter { it.startsWith("S") }
            .joinToString (prefix = " Family member name start with S: ")
    println(names)



}