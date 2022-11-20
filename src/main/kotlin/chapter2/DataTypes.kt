fun main(args: Array<String>) {

    //var : as variables on java
    var nameVar = "Mauro from var"

    //val : as final on java
    val nameVal = "Mauro from val"

    //numbers datatypes
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    //casting
    val intA = 123
    val longA = int.toLong()
    val floatA = 12.34F
    val doubleA = float.toDouble()

    //boolean
    val x = 1
    val y = 2
    val z = 2
    val b = x > y && x > z
    val c = y == z || x == z

    //char
    val char = "a"

    //string
    val helloWorld = "Hello World"

    //Arrays
    val array = arrayOf(1, 2, 3)
    val perfectSquares = Array(10) { k -> k * k }
    // Pull the first and second array value into variables
    val element1 = array[0]
    val element2 = array[1]
    // Set the second array item value to 5
    array[2] = 5

   //ranges
    val aToZ = "a".."z"
    val oneToNine = 1..9

    val isTrue = "c" in aToZ
    val isFalse = 11 in oneToNine

    val countingDown = 100.downTo(0)
    val rangeTo = 10.rangeTo(20)

    val oneToFifty = 1..50
    val oddNumbers = oneToFifty.step(2)

    val countingDownEvenNumbers = (2..100).step(2).reversed()

}