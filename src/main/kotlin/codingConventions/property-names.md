
Property names﻿
Names of constants (properties marked with const, or top-level or object val properties 
with no custom get function that hold deeply immutable data) should use uppercase 
underscore-separated (screaming snake case) names:

const val MAX_COUNT = 8
val USER_NAME_FIELD = "UserName"
Names of top-level or object properties which hold objects with behavior or mutable 
data should use camel case names:

val mutableCollection: MutableSet<String> = HashSet()
Names of properties holding references to singleton objects can use the same naming 
style as object declarations:

val PersonComparator: Comparator<Person> = /*...*/
For enum constants, it's OK to use either uppercase underscore-separated names 
(screaming snake case) (enum class Color { RED, GREEN }) or upper camel case names, 
depending on the usage.