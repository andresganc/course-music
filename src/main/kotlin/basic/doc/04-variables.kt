
// Variables

package basic.doc

fun main() {
    variablesVal()
    variablesVar()
    variablesTopLevel()
}


// Read-only local variables are defined using the keyword val. They can be assigned a value only once.
fun variablesVal() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")
}


// Variables that can be reassigned use the var keyword.
fun variablesVar() {
    var x = 5 // `Int` type is inferred
    x += 1
    println("x = $x")
}


// You can declare variables at the top level.
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun variablesTopLevel() {
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}
