fun main(args: Array<String>) {
	presentGently(42)
    presentGently("Dog")
	presentGently(null)
}
fun presentGently(v: Any?) {
	println("Hello. I would like to present you: $v") 
}