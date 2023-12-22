fun main(args: Array<String>) {

    val a = 1.22
    val b = 0.1

    // use of greater than operator
    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        b
    }

    println("max = $max")
}