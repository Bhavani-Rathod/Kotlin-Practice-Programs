package basic_Practice

fun main(){
    val num = 5
    val factorialResult = factorial(num)
    println("The factorial of $num is:$factorialResult")
}

fun factorial(n:Int):Int{
    return if (n==0){
        1
    }else{
        n* factorial(n-1)
    }
}