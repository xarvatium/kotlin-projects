import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("What is your first number? ")
    val num1:Int = reader.nextInt()
    print("What is your second number? ")
    val num2:Int = reader.nextInt()
    var sum = num1 + num2
    print("The sum of $num1 and $num2 is: $sum")
}