class   Student_Score{
    //data member
    var num : Int= 25
    var num2 : Int= 36
    var num3 : Int= 45

    //member function
    fun Hesabu() : Int{
        return num+num2+num3
    }
}

fun main(args: Array<String>) {
    //create object
    var Obj=eMobilis()
    println(Obj.Hesabu())
}