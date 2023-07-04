package functions

fun main(){
    println( sum(2,3,8,100,637,77,1,23))
    println(numbers(2,3,4,5))
}

fun sum(vararg numbers:Int):Int{
    var result = 0
    for (num in numbers){
        result+=num
    }
    return result
}

fun numbers(vararg numbers:Int){
    numbers.forEach { println(it) }
}