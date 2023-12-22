
import java.util.Scanner
fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    println("The input one is : $num1")
    val num2 = scanner.nextInt()
    println("The input two is : $num2")

    val sum = num1+num2

    println("The sum of the two inputs is : $sum")
}