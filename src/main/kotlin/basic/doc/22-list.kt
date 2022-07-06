package basic.doc

fun main() {
    listImmutables()
    listMutable()
    listMutable2()
    listMutableFilter()
}

fun listImmutables() {
    val weekday: List<String> = listOf("Monday", "TuesDay", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    println(weekday)
    println("Array Size: ${weekday.size} ")
    println("Array position 2:  ${weekday[2]} ")
    println("First Array :  ${weekday.first()} ")
    println("Last Array : ${weekday.last()} ")
}

fun listMutable() {
    val weekday: MutableList<String> = mutableListOf()
    weekday.add("Monday")
    weekday.add("Tuesday")
    println(weekday)
}

fun listMutable2() {
    val weekday: MutableList<String> = mutableListOf("Monday", "Tuesday")
    weekday.add(2, "Wednesday")
    weekday.add(3, "Thursday")
    println(weekday)
}

fun listMutableFilter() {
    val weekday1: MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val weekday2: MutableList<String> = mutableListOf()
    // Iterate and get monday
    val result1 = weekday1.filter { it == "Monday" }
    println("List filter by Monday : ${result1} ")

    // Iterate the position 0 from each word and get the letter that initial by S
    val result2 = weekday1.filter { it[0] == 'S' }
    println("List filter by S : ${result2} ")

    // Iterate the position 0 from each word and get the letter that initial by S and F
    val result3 = weekday1.filter { it[0] == 'S' || it[0] == 'F' }
    println("List filter by S and F : ${result3} ")

    // Travel weekday1 and add : the weekday2
    weekday1.forEach{
        weekday2.add( it + ":")
    }
    println("Travel into weekday1 and add to weekday2 : ${weekday2} ")
}