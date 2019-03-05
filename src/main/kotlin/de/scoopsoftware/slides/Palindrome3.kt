package de.scoopsoftware.slides.v3

// tag::content[]
fun String.isPalindrome() = this == this.reversed()



fun main(args: Array<String>) {
    println("dehydrated".isPalindrome()) // false
    println("detartrated".isPalindrome())  // true
}
// end::content[]
