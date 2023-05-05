fun dennis(){
    println("This is a customized user defined function")
}

fun hesabu(){
    val num=3
    val num1=5
    println("The sum of $num and $num1 is ${num+num1}")
}

fun deduction(){
    val num4=54
    val num5=76
    println("The difference between $num5 and $num4 is ${num5-num4}")
}

fun names(){
    val myclass= arrayOf("Dennis", "Caleb", "Joshua", "Michael", "Dexter")
    println("My name is ${myclass[2]}")
}

fun main(args: Array<String>) {
    dennis()
    hesabu()
    deduction()
    names()
}