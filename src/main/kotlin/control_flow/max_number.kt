package control_flow

fun main(){
    val x=4
    val y=6
    val z=3

    if (x>y && x>z){
        println("x is maximum")
    }
    else
    if(y>x && y>z){
        println("y is maximum")
    }else{
        println("z is maximum")
    }
}