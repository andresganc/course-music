package basic.doc

fun main() {
    println(weekday(0))
    println(arraySet())
    println(arraySize())
    arrayFirst()
    arrayLast()
    forEachItWeek()
    forEachIfItWeek()
}

fun weekday(numArray: Int): String {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )
    return arrayWeekDay[numArray]
}

// Array Set
fun arraySet() {
    val profile = arrayOf("Jorge", "Andres", "Giraldo", "Arenas", "42")
    profile.set(4, "43")
    println(profile[4])
}

// Array Size
fun arraySize(): Int {
    val fruits = arrayOf("Pears", "Apples", "Grapes", "Strawberries", "Cherries", "peach")
    return fruits.size
}

fun arrayFirst() {
    val fruits = arrayOf("1 Pears", "2 Apples", "3 Grapes", "4 Strawberries", "5 Cherries", "6 peach")
    println(fruits.first())
}

fun arrayLast() {
    val fruits = arrayOf("1 Pears", "2 Apples", "3 Grapes", "4 Strawberries", "5 Cherries", "6 peach")
    println(fruits.last())
}

private fun forEachItWeek() {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    arrayWeekDay.forEach{
        println(it)
        if(it == "Friday") {
            println("Very good it's friday")
        }
    }
}