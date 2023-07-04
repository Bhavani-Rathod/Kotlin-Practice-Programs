package loops

fun main(args: Array<String>) {

    var factorial = 1

    for (i in 1..6){
        factorial*=i
    }
    println(factorial)
}
