package functions

fun main(){
    sendMessage(name = "Bhavani")
}

fun sendMessage(name:String,message:String= sendText()){
    println("Hello $name , $message")
}

fun sendText():String{
    return "Some text!"
}