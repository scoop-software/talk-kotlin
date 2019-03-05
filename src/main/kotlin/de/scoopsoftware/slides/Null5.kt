package de.scoopsoftware.slides.n5

//tag::content[]
class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person("John", "Smith")
    val p2 = Person("John", "Smith")

    println(p1.equals(p2)) // true
    println(p1.equals(42)) // false
}
//end::content[]
