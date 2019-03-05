package de.scoopsoftware.slides.v3

// tag::class[]
class Person(val name: String, var age: Int) {
    var jobs = 0
        set(value) {
            field = when {
                value < 0 -> 0
                value > 3 -> 3
                else -> value
            }
        }
}

// end::class[]

// tag::main[]
fun main(args: Array<String>) {
    val p = Person("Jim", 33)
    p.jobs = 1
    println(p.jobs) // 1
    p.jobs = -5
    println(p.jobs) // 0
    p.jobs = 7
    println(p.jobs) // 3
}
// end::main[]
