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

    println("Hello $nameVal!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}