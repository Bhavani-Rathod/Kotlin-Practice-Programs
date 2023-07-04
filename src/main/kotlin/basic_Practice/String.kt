package basic_Practice

fun main(){
    val str = "Bhavani"
    val char = 'a'
    val occurence = numOfOccurences(str, char)
    println("number of occurences of $char in $str is $occurence")
}

fun numOfOccurences(str:String,char:Char):Int{
    return str.count { it==char }
}