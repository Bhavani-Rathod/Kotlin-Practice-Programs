package control_flow

fun main(){
    val x:Any = 'a'

    //finding type of the variable
    val type = when(x){
        is String-> println("String")
        is Int -> println("Int")
        is Char -> println("Char")
        else -> println("Any")
    }
    println(type)
}