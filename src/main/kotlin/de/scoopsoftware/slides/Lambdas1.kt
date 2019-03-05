package de.scoopsoftware.slides.l1

//tag::person[]
class Person(val name: String, val age: Int)

//end::person[]

val people = listOf(Person("Alice", 29), Person("Bob", 31))

//tag::start[]
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//end::start[]

    example1()
    example2()
    example3()
    example4()
}


fun example1() {
//tag::example1[]
    println(people.joinToString(" ", transform = { p: Person -> p.name })) // Alice Bob
//end::example1[]
}

fun example2() {
//tag::example2[]
    println(people.joinToString(" ") { p: Person -> p.name })              // Alice Bob
//end::example2[]
}

fun example3() {
//tag::example3[]
    println(people.joinToString(" ") { p -> p.name })                      // Alice Bob
//end::example3[]
}

fun example4() {
//tag::example4[]
    println(people.joinToString(" ") { it.name })                          // Alice Bob
//end::example4[]
}

fun example5() {
//tag::example5[]
    println(people.joinToString(" ", transform = Person::name))            // Alice Bob
//end::example5[]
//tag::end[]
}
//tag::end[]
