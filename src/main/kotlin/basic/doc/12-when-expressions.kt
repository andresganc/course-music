package basic.doc

// When expression
fun main() {

    println(month(12))

    println(quarter(8))

    println(semester(5))

    println(whenIn(85))

    println(whenIs(5.8))

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

// Change month from num to string
fun month(monthNum: Int): String {
    return when(monthNum) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Month not valid"
    }
}

// Get quarter of a month
fun quarter(monthNum: Int): String {
    return when(monthNum) {
        1,2,3 -> "First trimester"
        4,5,6 -> "Second trimester"
        7,8,9 -> "Third trimester"
        10,11,12 -> "Fourth trimester"
        else -> "Month not valid"
    }
}

// Get semester of a month
fun semester(monthNum: Int): String {
    return when(monthNum) {
        1,2,3,4,5,6 -> "First semester"
        7,8,9,10,11,12 -> "Second semester"
        else -> "Month not valid"
    }
}

// When + In
fun whenIn(monthNum: Int): String {
    return when(monthNum) {
        in 1..6 -> "First semester - with In"
        in 7..12 -> "Second semester - with In"
        !in 1..12 -> "The month is not between 1 and 12 "       // !in = Is not between
        else -> "Month not valid - with in"
    }
}

// When + Is : Variables type
fun whenIs(varType: Any): String {
    return when(varType) {
        is String -> "Is a variable type string"
        is Int -> "Is a variable type int"
        is Boolean -> "Is a variable type boolean"
        // is Float -> "Is a variable type float"
        else -> "Type of variable no recognized"
    }
}