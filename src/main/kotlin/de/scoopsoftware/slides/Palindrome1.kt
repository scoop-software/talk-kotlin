package de.scoopsoftware.slides.v1

// tag::content[]
fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}

fun main(args: Array<String>) {
    println(isPalindrome("dehydrated"))   // false
    println(isPalindrome("detartrated"))  // true
}
// end::content[]
