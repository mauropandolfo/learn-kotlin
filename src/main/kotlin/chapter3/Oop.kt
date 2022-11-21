package chapter3

/*
Internal: This means you can create a new instance of your class
from anywhere within your module

Private: This is more restrictive than the previous one because
a class is only visible in the scope of the file defining it

Protected: You can use this accessibility level only for subclasses;
it is not available for the file-level type of declaration

 */

//Class with validations method
class Person (val firstName: String, val lastName: String, val  age: Int?){
    init{require(firstName.trim().length > 0) { "Invalid firstNam argument." }
        require(lastName.trim().length > 0) { "Invalid lastName  argument." }
        if (age != null) {
            require(age >= 0 && age < 150) { "Invalid age argument." }
        }
    }
}

//classic class with getters and setters methods
class Person2(firstName: String, lastName: String, howOld:  Int?) {
    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName,$lastName"
        this.age = howOld
    }
    fun getName(): String = this.name
    fun getAge(): Int? = this.age
}


fun main(args: Array<String>) {
    val person1 = Person("Alex", "Smith", 29)
    val person2 = Person("Jane", "Smith", null)
    println("${person1.firstName},${person1.lastName} is  ${person1.age} years old")
    println("${person2.firstName},${person2.lastName} is ${person2.age?.toString() ?: "?"} years old")
}
