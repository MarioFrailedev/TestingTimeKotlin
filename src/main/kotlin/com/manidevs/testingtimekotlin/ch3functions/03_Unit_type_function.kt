fun main(args: Array<String>) {
    val p = printSum2(1, 2)
    println(p is Unit)
}
fun printSum2(a: Int, b: Int): Unit{
	val sum = a + b
}