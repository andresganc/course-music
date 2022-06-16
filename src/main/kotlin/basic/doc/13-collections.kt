
// Collections

package basic.doc

// Iterate over a collection.

fun main() {

    collectionIterate()
    collectionUseOperator()
    collectionLambda()
}

fun collectionIterate() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

// Check if a collection contains an object using in operator.
fun collectionUseOperator() {
    val items = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

// Using lambda expressions to filter and map collections:
fun collectionLambda() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}