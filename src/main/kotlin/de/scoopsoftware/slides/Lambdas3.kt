package de.scoopsoftware.slides.l3

//tag::start[]
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))

    val ageGroups = people.groupBy { it.age }
    println(ageGroups)
// {31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]}

//end::start[]
//tag::map[]
    println(ageGroups.mapValues{(_, list) -> list.map { it.name }})
// {31=[Alice, Carol], 29=[Bob]}
//end::map[]
//tag::end[]
}
//end::end[]
