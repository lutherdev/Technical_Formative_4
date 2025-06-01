package com.example.technicalformative4

/*
* Create a program that accepts multiple integers that will
* be stored in a List.
* The List will be passed to a function.
* The function must contain a lambda expression which determines
*  which among the inputs are odd or even and display these
*  numbers. The program must also have a lambda that gets the
*  total of all the odd numbers as well as the total of all the even numbers.

Note: Please read about how to use .filter and .sum
*/

fun checkOddEven(numList: MutableList<Int>){
    val numCheck: (Int) -> Boolean = {num -> num % 2 == 0}
    val getSum: (List<Int>) -> Int = {it.sum()}

    val evenList = mutableListOf<Int>()
    val oddList = mutableListOf<Int>()

    for (num in numList){
        if (numCheck(num)){
            evenList.add(num)
        } else {
            oddList.add(num)
        }
    }
    println("Even numbers: $evenList")
    println("Odd numbers: $oddList")
    println("Sum of even numbers : ${getSum(evenList)}")
    println("Sum of even numbers : ${getSum(oddList)}")
}
fun main(){
    val numList = mutableListOf<Int>()
    for (i in 0 until 5){
        println("Enter 3 numbers [${i+1}]: ")
        val inp = readln().toInt()
        numList.add(inp)
    }
    checkOddEven(numList)
}


