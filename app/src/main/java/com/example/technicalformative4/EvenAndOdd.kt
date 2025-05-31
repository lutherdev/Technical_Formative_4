package com.example.technicalformative4



/*
* Create a program that accepts multiple integers that will
* be stored in a List. The List will be passed to a function.
* The function must contain a lambda expression which determines
*  which among the inputs are odd or even and display these
*  numbers. The program must also have a lambda that gets the
*  total of all the odd numbers as well as the total of all the even numbers.

Note: Please read about how to use .filter and .sum
*/
/*
fun checkOddEven(numList: MutableList<Int>): Int {
    val evenList = mutableListOf<Int>()
    val oddList = mutableListOf<Int>()
    val numCheck: (Int) -> Boolean = {num -> num % 2 == 0}
    for (num in numList){
        if (numCheck(num)){
            evenList.add(num)

        } else {
            oddList.add(num)
        }
    }

}
*/
fun doSomething(x: Int, action: (Int) -> Int): Int {
    return action(x)
}

// Lambda passed during the call
val result = doSomething(4) { it + 3 }

fun printDouble(x: Int) {
    val double = { num: Int -> num * 2 } // Lambda defined inside
    println(double(x))  // Use it
}

fun main(){
    val numList = mutableListOf<Int>()
    for (i in 0 until 5){
        println("Enter 3 numbers [${i+1}]: ")
        val inp = readLine()?.toIntOrNull() ?: 0
        numList.add(inp)
    }
    for (num in numList){
        println(num)
    }

}