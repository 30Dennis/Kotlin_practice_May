//Parent/Superclass
open class Shapes{
    open fun draw(){
        println("Drawing Shape")
    }

}
//child/subclass class
class Rectangle:Shapes(){
    override fun draw(){
        println("Drawing a Rectangle")
    }

}
class Circle:Shapes(){
    override fun draw() {
        println("Drawing a circle")
    }

}
class Square:Shapes(){
    override fun draw() {
        println("Drawing a square")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shapes> = arrayOf(Circle(), Rectangle(), Square())
    for (Shapes in shapes){
        Shapes.draw()
    }
}
