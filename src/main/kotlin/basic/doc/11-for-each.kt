package basic.doc

fun main() {
    forEachWeek()
    forEachItWeek()
    forEachIfItWeek()
}

fun forEachWeek() {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    arrayWeekDay.forEach{
        println("WeekDay")
    }
}

private fun forEachItWeek() {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    arrayWeekDay.forEach{
        println(it)
    }
}

fun forEachIfItWeek() {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    arrayWeekDay.forEach{
        println(it)
        if(it == "Friday") {
            println("Very good it's friday")
        }
    }
}