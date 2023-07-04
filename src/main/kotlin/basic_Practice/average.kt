package basic_Practice

fun main(){
    val numbers = arrayOf(2,3,4,5)
    val count = numbers.count()

    val addition = numbers[0]+numbers[1]+numbers[2]+numbers[3]
    val result = addition/count

    println(result)
}