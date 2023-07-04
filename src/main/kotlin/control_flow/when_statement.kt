package control_flow

fun main(){
    val num = 5

    when(num){
        !in 1..5-> println("num is between 1 to 5")
        1-> println("num is one")
        3-> println("num is three")
        5-> println("num is five")
    }
}