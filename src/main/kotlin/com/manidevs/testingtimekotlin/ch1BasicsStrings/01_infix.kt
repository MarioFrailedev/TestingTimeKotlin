fun main(args: Array<String>) {
    val capitols = listOf("England" to "London", "Poland" to "Warsaw") 
    for ((country, city) in capitols) { 
        println("Capitol of $country is $city")

    }

    val myFamilyMember = listOf("Wife" to "Angelica", "babyGril" to "Sofia", "babyGril" to "Nicole", "Me Dad" to "Mario")
    for((familyMember, name) in myFamilyMember)
        println("My $familyMember and the name is $name")
}