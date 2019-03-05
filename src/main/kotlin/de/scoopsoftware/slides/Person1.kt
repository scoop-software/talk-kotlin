package de.scoopsoftware.slides.v1

// tag::class[]
class Person(val name: String, var age: Int)

// end::class[]

// tag::main[]
fun main(args: Array<String>) {
    val p = Person("Jim", 33)
    println(p.name)
}
// end::main[]
