package de.scoopsoftware.slides.v2

// tag::class[]
class Person(val name: String, var age: Int) {
    val isAdult: Boolean
        get() = age >= 18
}

// end::class[]

// tag::main[]
fun main(args: Array<String>) {
    val p = Person("Jim", 33)
    println(p.isAdult) // true
    p.age = 15
    println(p.isAdult) // false
}
// end::main[]
