package de.scoopsoftware.slides.ifx1

//tag::content[]
class Person(val name: String, var spouse: Person? = null) {
    fun marry(p: Person) {
        spouse = p
        p.spouse = this
        println("$name is now married to ${p.name}")
    }
}

fun main(args: Array<String>) {
    val john = Person("John")
    val anna = Person("Anna")
    john.marry(anna)  // John is now married to Anna
}
//end::content[]
