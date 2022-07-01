package basic.doc

fun main() {
    weekday(2)
}

fun weekday(numArray: Int): String {
    val arrayWeekDay = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )
    return arrayWeekDay[numArray]
}