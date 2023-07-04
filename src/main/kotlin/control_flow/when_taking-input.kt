package control_flow

fun main(){
    println("Please enter a number:")
    val number = readlnOrNull()?.toInt()

    val result = when(number){
        2 -> println("num is two")
        in 10..50-> println("num is between 10 to 50")
        else-> println("num is out of range")
    }

    println(result)
}