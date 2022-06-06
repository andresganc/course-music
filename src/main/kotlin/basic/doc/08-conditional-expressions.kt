
// Conditional expressions

package basic.doc

fun main() {
    println("max of 0 and 42 is ${maxOf1(0, 42)}")

    println("max of 0 and 42 is ${maxOf2(0, 42)}")
}

fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}


// In Kotlin, if can also be used as an expression.
fun maxOf2(a: Int, b: Int) = if (a > b) a else b



