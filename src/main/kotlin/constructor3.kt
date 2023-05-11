fun main(args: Array<String>){
    val stu = Student("Harry", 24)
}

open class College{

    constructor(name: String, age: Int){
        println("parent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}
class Student: College{
    constructor(name: String, age: Int): super(name,age){
        println("child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }
}