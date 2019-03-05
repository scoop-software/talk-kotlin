package de.scoopsoftware.slides.o3

//tag::content[]
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person) = p1.name.compareTo(p2.name)
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
    // Output: [Person(name=Alice), Person(name=Bob)]
}
//end::content[]
