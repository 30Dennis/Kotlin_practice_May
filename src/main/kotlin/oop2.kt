class   eMobilis{
    //data member
    var num : Int= 6

    //member function
    fun Hesabu() : Int{
        return num*num
    }
}

fun main(args: Array<String>) {
    //create object
    var Obj=eMobilis()
    println(Obj.Hesabu())
}