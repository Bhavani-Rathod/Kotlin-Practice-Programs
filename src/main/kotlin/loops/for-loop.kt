package loops

import functions.numbers

fun main(){

    for (i in 1..10){
        println(i)
    }

    for (i in 1 until 10){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }
    for (i in 1 until 10 step 3){
        println(i)
    }

}