
// Classes and instances

package basic.doc


class Shape

// Properties of a class can be listed in its declaration or body.
class RectangleClass(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}


// The default constructor with parameters listed in the class declaration is available automatically.
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}
fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}


// Inheritance between classes is declared by a colon (:). Classes are final by default;
// to make a class inheritable, mark it as open.
open class Shape2

class RectangleClass2(var height: Double, var length: Double): Shape2() {
    var perimeter = (height + length) * 2
}
