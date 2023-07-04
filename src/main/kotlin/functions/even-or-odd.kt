package functions

fun main(){
    val number = evenNumber(5)

    if (number){
        println("number is even")
    }else{
        println("number is odd")
    }
}

fun evenNumber(num:Int):Boolean{
    return num%2==0
}