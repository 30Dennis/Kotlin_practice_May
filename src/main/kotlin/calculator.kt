fun main() {
    println("Welcome to the Calculator!")

    // Get the input from the user
    print("Enter the first number: ")
    val num1 = readln()!!.toDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = readln()!!

    print("Enter the second number: ")
    val num2 = readln()!!.toDouble()

    // Perform the operation based on the operator entered
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2

        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Invalid operator entered. Please try again.")
            return
        }
    }

    // Output the result to the user
    println("The result is: $result")
}