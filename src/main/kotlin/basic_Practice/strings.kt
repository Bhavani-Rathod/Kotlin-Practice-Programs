package basic_Practice

fun main(){
    val str = "Hello World"
    val count = str.length
    val uppercase = str.uppercase()
    val drop = str.dropLast(2)
    val add = str.plus(uppercase)
    val reverse = str.reversed()

    println(reverse)
    println(str[2])

}