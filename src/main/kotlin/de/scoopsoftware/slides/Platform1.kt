package de.scoopsoftware.slides.pf1

import de.scoopsoftware.slides.java.User

//tag::content[]
// Kotlin
fun main(args: Array<String>) {
    val u = User("jsmith")
    println(u.id?.toUpperCase())    // JSMITH
    println(u.email?.toUpperCase()) // null

    println(u.id.toUpperCase())    // JSMITH
    println(u.email.toUpperCase()) // java.lang.IllegalStateException: u.email must not be null
}
//end::content[]
