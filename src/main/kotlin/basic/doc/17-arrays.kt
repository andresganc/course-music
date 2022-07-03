package basic.doc

fun main() {
    println(weekday(0))
    arraySet()
    arraySize()
}

fun weekday(numArray: Int): String {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )
    return arrayWeekDay[numArray]
}

// Array Set
fun arraySet() {
    val profile = arrayOf("Jorge", "Andres", "Giraldo", "Arenas", "42")
    profile.set(4, "43 ")
    println(profile)
}

// Array Size
fun arraySize() {
    val fruits = arrayOf("Pears", "Apples", "Grapes", "Strawberries", "Cherries", "peach")
    println(fruits.size)
}