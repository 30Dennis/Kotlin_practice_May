fun main(args: Array<String>) {
    //this is a for loop

    for (i in 5..12){
        println("loop : $i")
    }
    val myarr= arrayOf("ab", "be", "cd", "ef", "gh", 2.45)

    for (n in myarr)
        println(n)

    //this is a while loop

    var num=10
    while (num>=0){
        println("loop : $num")
        num--
    }

    var num3=0

    while (num3<=10){
        println("loop : $num3")
        num3++
    }

    //Do While loop

    var num4=100
    do {
        println("loop : $num4")
        num4++
    }while (num4<=105)

}