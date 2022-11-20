@file:Suppress("UNREACHABLE_CODE")

import java.io.IOException
import java.util.*

fun main(args: Array<String>) {

    //while
    while (true) {
        println("This will print out for a long time!")
    }

    //for

    val list = listOf(1, 2, 3, 4)

    for (k in list) {
        println(k)
    }


    val set = setOf(1, 2, 3, 4)

    for (k in set) {
        println(k)
    }

    val oneToTen = 1..10
    for (k in oneToTen) {
        for (j in 1..5) {
            println(k * j)
        }
    }

    val string = "print my characters"
    for (char in string) {
        println(char)
    }

    val array = arrayOf(1, 2, 3)

    for (index in array.indices) {
        println("Element $index is ${array[index]}")
    }

    //if-else statement as expression
    val date = Date()
    val today = if (date.year == 2016) true else false
    fun isZero(x: Int): Boolean {
        return if (x == 0) true else false
    }

    //try-catch as expression
    val success = try {
        //readFile()
        true
    } catch (e: IOException) {
        false
    }

    //smartcast
    fun printStringLength(any: Any) {
        if (any is String) {
            println(any.length)
        }
    }

    fun isEmptyString(any: Any): Boolean {
        return any is String && any.length == 0
    }

    fun isNotStringOrEmpty(any: Any): Boolean {
        return any !is String || any.length == 0
    }

    //explicit casting
    fun length(any: Any): Int {
        val string = any as String
        return string.length
    }

    //when expression
    fun whatNumber(x: Int) {
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is 1")
            else -> println("X is neither 0 or 1")
        }
    }

    fun isMinOrMax(x: Int): Boolean {
        val isZero = when (x) {
            Int.MIN_VALUE -> true
            Int.MAX_VALUE -> true
            else -> false
        }
        return isZero
    }

    fun isZeroOrOne(x: Int): Boolean {
        return when (x) {
            0, 1 -> true
            else -> false
        }
    }

    fun isAbs(x: Int): Boolean {
        return when (x) {
            Math.abs(x) -> true
            else -> false
        }
    }

    fun isSingleDigit(x: Int): Boolean {
        return when (x) {
            in -9..9 -> true
            else -> false
        }
    }

    fun isDieNumber(x: Int): Boolean {
        return when (x) {
            in listOf(1, 2, 3, 4, 5, 6) -> true
            else -> false
        }
    }

    fun startsWithFoo(any: Any): Boolean {
        return when (any) {
            is String -> any.startsWith("Foo")
            else -> false
        }
    }

    /*
    when (val statusCode = response.statusCode) {
        in 200..204 -> println("Success: $statusCode")
        in 400..451 -> println("Client Error: $statusCode")
        else -> println("Unknown HTTP status code")
    }
    */
    fun whenWithoutArgs(x: Int, y: Int) {
        when {
            x < y -> println("x is less than y")
            x > y -> println("X is greater than y")
            else -> println("X must equal y")
        }
    }

    fun addTwoNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun largestNumber(a: Int, b: Int, c: Int): Int {
        fun largest(a: Int, b: Int): Int {
            if (a > b) return a
            else return b
        }
        return largest(largest(a, b), largest(b, c))
    }

    fun printLessThanTwo() {
        val list = listOf(1, 2, 3, 4)
        list.forEach(fun(x) {
            if (x < 2) println(x)
            else return
        })
        println("This line will still execute")
    }

    fun printUntilStopA() {
        val list = listOf("a", "b", "stop", "c")
        list.forEach stop@ {
            if (it == "stop") return@stop
            else println(it)
        }
    }

    fun printUntilStopB() {
        val list = listOf("a", "b", "stop", "c")
        list.forEach {
            if (it == "stop") return@forEach
            else println(it)
        }
    }

    
}