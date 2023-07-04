package basic_Practice

fun main(){
    val name:String? = null

    val name2:String = name?: "Bhavani" //elvis operator ?:

    println(name2)
}