
// Ranges

package basic.doc

fun main() {
    rangeIn()
    rangeOut()
}


// Check if a number is within a range using in operator.
fun rangeIn() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

// Check if a number is out of range.
fun rangeOut() {
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}