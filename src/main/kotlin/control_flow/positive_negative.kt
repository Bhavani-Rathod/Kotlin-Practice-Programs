package control_flow

fun main(){
    val x = -5

    val res = if (x>0){
        println("$x is positive ")
    }
    else if (x<0){
        println("$x is negative")
    }
    else{
        println("$x is equal to zero")
    }
}