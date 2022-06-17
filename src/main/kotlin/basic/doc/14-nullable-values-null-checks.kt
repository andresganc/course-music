
/*
Nullable values and null checks
A reference must be explicitly marked as nullable when null value is possible. Nullable type names have ? at the end.
*/

package basic.doc

fun main() {

    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("99", "b")
}

// Return null if str does not hold an integer:
/*
fun parseInt(str: String): Int? {
    // ...
}
*/

// Use a function returning nullable value:
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}


// Or

fun parseInt2(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt2(arg1)
    val y = parseInt2(arg2)

    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}





