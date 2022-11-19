@file:Suppress("UNREACHABLE_CODE")

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


}