
// Type checks and automatic casts

package basic.doc


// The is operator checks if an expression is an instance of a type. If an immutable local variable or property
// is checked for a specific type, there's no need to cast it explicitly:

fun main() {

    fun printLength1(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength1(obj) ?: "Error: The object is not a string"} ")
    }
    printLength1("Incomprehensibilities")
    printLength1(1000)
    printLength1(listOf(Any()))


    fun printLength2(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength2(obj) ?: "Error: The object is not a string"} ")
    }
    printLength2("Incomprehensibilities")
    printLength2(1000)
    printLength2(listOf(Any()))

    fun printLength3(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength3(obj) ?: "Error: The object is not a string"} ")
    }
    printLength3("Incomprehensibilities")
    printLength3("")
    printLength3(1000)

}

fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}


// Or


fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}


// Or even


fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}


