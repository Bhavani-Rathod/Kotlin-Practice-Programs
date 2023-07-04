package functions

fun main(){
    val area = areaOfRectangle(4,3)
    println(area)
}

fun areaOfRectangle(length:Int, width:Int):Int{
    return length*width
}