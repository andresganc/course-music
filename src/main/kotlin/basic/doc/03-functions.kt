
// Functions

package basic.doc

fun main() {

    print("sum of 3 and 5 is ")
    println(sum1(3, 5))

    println("sum of 19 and 23 is ${sum2(19, 23)}")

    // printSum1(-1, 8)

    printSum2(-1, 8)
}

// A function with two Int parameters and Int return type.
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// A function body can be an expression. Its return type is inferred.
fun sum2(a: Int, b: Int) = a + b


// A function that returns no meaningful value.
/*
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
*/

// Unit return type can be omitted.
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}