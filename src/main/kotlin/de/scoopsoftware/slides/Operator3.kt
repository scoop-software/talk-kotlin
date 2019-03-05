package de.scoopsoftware.slides.op3

//tag::content[]
class Person(val firstName: String, val lastName: String): Comparable<Person> {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Person) return false
        return other.firstName == firstName && other.lastName == lastName
    }

    override fun compareTo(other: Person): Int =
        compareValuesBy(this, other, Person::lastName, Person::firstName)
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 == p2)    // false
    println(p1 != p2)    // true
    println(p1 < p2)     // false
    println(p1 >= p2)    // true
}
//end::content[]
