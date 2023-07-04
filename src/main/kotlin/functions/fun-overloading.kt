package functions

fun main(){
    val max = getMax(1,6,0)
    println(max)
}

fun getMax(a:Int,b:Int):Int{
    return if (a>b) a else b
}

fun getMax(a:Int,b:Int,c:Int):Int{
    return if (a>b && a>c){
        a
    }else if (b>a && b>c){
        b
    }else{
        c
    }
}