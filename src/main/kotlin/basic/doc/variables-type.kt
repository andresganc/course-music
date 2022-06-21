
// VARIABLES TYPE

package basic.doc

fun main() {
    integerType()
    longType()
    floatType()
    doubleType()
    charType()
    stringType()
    booleanType()
    dynamicType()
}

// Integer
fun integerType() {
    // Variables integer: number variables of type integer
    // Range: -2.147.483.647 a 2.147.483.647
    var varInteger: Int = 27
    println(varInteger)
}

// Long
fun longType() {
    // Variables long: number variables of type integer, With high ranges
    // Range: -9.223.372.036.854.775.807 a 9.223.372.036.854.775.807
    var varLong: Long = 27
    println(varLong)
}

// Float
fun floatType() {
    // Variables float: number variables that accept decimals (Should be added the letter f at the end)
    // Range: Accept 6 decimals
    var varFloat: Float = 29.123456f
    println(varFloat)
}

// Double
fun doubleType() {
    // Varibles Double: number varibles that accept decimals (Not add letter f at the end)
    // Range: Accept 9 decimals
    var varDouble: Double = 29.123456789
    println(varDouble)
}

// Char
fun charType() {
    // Variables Char: Can only store 1 character type text (Between single quotes)
    // Range: 1 Character
    var varChar: Char = 'A'
    println(varChar)
}

// String
fun stringType() {
    // Variables string: Text string (Between double quotation marks)
    // Range:
    var varString: String = "Andres Giraldo"
    println(varString)
}

// Boolean
fun booleanType() {
    // Variables boolean: True or False
    var varBoolean: Boolean = true
    println(varBoolean)
}

// dynamically assigned variables types
fun dynamicType() {
    // The type of variables can be assigned dynamically
    var varDynamic1 = "Andres Giraldo"      // String type
    var varDynamic2 = 29                    // Integer or Long type
    var varDynamic3 = 5.1979                // Float or Double type
    var varDynamic4 = true                  // Boolean type
    println("Nombre: $varDynamic1")
    println("Fecha: $varDynamic2 $varDynamic3 ")
    print("State: $varDynamic4")
}