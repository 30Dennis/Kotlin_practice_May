import kotlin.math.sqrt

fun main(args: Array<String>) {
    hesabu()
    println(sqrt(45.20))
    myfunctions("Dennis", 29, "Otieno")
    myfunctions("George", 43, "Ogeta")

}
fun myfunctions(fname:String, Age:Int, lname:String){

    println("My First name is $fname and I am $Age years old ")

    println("My First name is $fname and I am $Age years old and I always use my last name $lname as a family name for recognition ")

    println("I $fname $lname i have always been Raila's aide for last $Age years")

}