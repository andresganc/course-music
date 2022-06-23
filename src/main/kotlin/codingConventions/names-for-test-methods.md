
package codingConventions

/*
    In tests (and only in tests), you can use method names with spaces enclosed in backticks.
    Note that such method names are currently not supported by the Android runtime.
    Underscores in method names are also allowed in test code.
*/

class MyTestCase {
    @Test fun `ensure everything works`() { /*...*/ }

    @Test fun ensureEverythingWorks_onAndroid() { /*...*/ }
}