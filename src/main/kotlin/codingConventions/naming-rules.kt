


package codingConventions

// CODING CONVENTIONS
/*
Edit page - Last modified: 17 June 2022
Commonly known and easy-to-follow coding conventions are vital for any programming language.
Here we provide guidelines on the code style and code organization for projects that use Kotlin.
*/

/*
- Configure style in IDE
Two most popular IDEs for Kotlin - IntelliJ IDEA and Android Studio provide powerful support for code styling.
You can configure them to automatically format your code in consistence with the given code style
*/

/*
- Source code organization
Directory structure
In pure Kotlin projects, the recommended directory structure follows the package structure with the common root package omitted.
For example, if all the code in the project is in the org.example.kotlin package and its subpackages,
files with the org.example.kotlin package should be placed directly under the source root,
and files in org.example.kotlin.network.socket should be in the network/socket subdirectory of the source root.

On JVM: In projects where Kotlin is used together with Java, Kotlin source files should reside in the same source root as the Java source files,
and follow the same directory structure: each file should be stored in the directory corresponding to each package statement.
*/



// NAMING RULES

// - Packages
/*
    Package and class naming rules in Kotlin are quite simple:

    Names of packages are always lowercase and do not use underscores (org.example.project).
    Using multi-word names is generally discouraged, but if you do need to use multiple words,
    you can either just concatenate them together or use camel case (org.example.myProject).
*/

// - Classes and objects start with an uppercase letter and use camel case:
open class DeclarationProcessor { /*...*/ }
object EmptyDeclarationProcessor : DeclarationProcessor() { /*...*/ }

// - Functions
/*
Names of functions, properties and local variables start with a lowercase letter and use
camel case and no underscores:
*/
fun processDeclarations() { /*...*/ }
var declarationCount = 1

// Exception: factory functions used to create instances of classes can have the same name as the abstract return type:
interface Foo { /*...*/ }

class FooImpl : Foo { /*...*/ }

fun Foo(): Foo { return FooImpl() }