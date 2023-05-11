class Students(var name:String, var gender: String, var age: Int ){


}

fun main(args: Array<String>) {
    //This is an object
    var myobj=Students("Dennis", "Male", 22)
    var myobj2=Students("Mark", "Male", 19)
    var myobj3=Students("Jane", "Female", 20)
    var myobj4=Students("Caleb", "Male", 25)
    var myobj5=Students("Joshua", "Male", 21)
    var myobj6=Students("Mercy", "Female", 23)

    println("Student name is ${myobj.name} and he is a ${myobj.gender} of ${myobj.age} years old")
    println("Student name is ${myobj2.name} and he is a ${myobj2.gender} of ${myobj2.age} years old")
    println("Student name is ${myobj3.name} and he is a ${myobj3.gender} of ${myobj3.age} years old")
    println("Student name is ${myobj4.name} and he is a ${myobj4.gender} of ${myobj4.age} years old")
    println("Student name is ${myobj5.name} and he is a ${myobj5.gender} of ${myobj5.age} years old")
    println("Student name is ${myobj6.name} and he is a ${myobj6.gender} of ${myobj6.age} years old")
    println("${myobj6.name} is a ${myobj6.gender} student of age ${myobj6.age} years.")
    println("${myobj5.name} has been som much offender to realized he is of ${myobj5.age} years less and being of ${myobj5.gender} gender he is proud")

}