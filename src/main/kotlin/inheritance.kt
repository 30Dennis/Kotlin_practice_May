open class wazazi{
    val mama="she like cooking"
    val baba="He likes watching Manchester United"
}
class boy:wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobject=boy()
    kijanaobject.mvulana()

    val msichanaobject=girl()
    msichanaobject.msichana()
}