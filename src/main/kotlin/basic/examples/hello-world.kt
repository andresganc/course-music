package basic.examples

fun main() {
    print(helloWorld("Andres"))
}

fun helloWorld(name: String): String {
    return "Hello $name"
}