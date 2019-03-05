package de.scoopsoftware.slides.v4

// tag::class[]
data class Person(val name: String, var age: Int)

// end::class[]

// tag::main[]
fun main(args: Array<String>) {
    val p1 = Person("Jim", 33)
    val p2 = p1.copy()
    println(p1)        // Person(name=Jim, age=33)
    println(p2)        // Person(name=Jim, age=33)
    println(p1 == p2)  // true
    println(p1 === p2) // false

    val p3 = p1.copy(age=17)
    println(p3)        // Person(name=Jim, age=17)
}
// end::main[]
