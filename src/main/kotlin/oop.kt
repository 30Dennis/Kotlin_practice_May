class Sturborn{
    //This is a data member
    private var wanafunzi: Int  = 31

    //This is a member function
    fun calculate():Int{
        return wanafunzi *wanafunzi
    }
}

fun main(args: Array<String>) {
    //this is an object

    val myobj=Sturborn()
    println(myobj.calculate())
}