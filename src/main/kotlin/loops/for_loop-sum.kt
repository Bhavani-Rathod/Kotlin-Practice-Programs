package loops

fun main(){
    var sum = 0

    for (i in 1..100){
        sum += i
    }
    println(sum)

    evenNumbers()

}

fun evenNumbers(){
    for (i in 1..100){
        if (i%2==0){
            println(i)
        }
    }
}