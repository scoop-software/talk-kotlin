package de.scoopsoftware.slides.v2

// tag::content[]
fun isPalindrome(s: String) = s == s.reversed()



fun main(args: Array<String>) {
    println(isPalindrome("dehydrated"))   // false
    println(isPalindrome("detartrated"))  // true
}
// end::content[]
