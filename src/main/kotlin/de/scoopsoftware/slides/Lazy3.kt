package de.scoopsoftware.slides.lazy3

//tag::content[]
class Email {/* ... */}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String /* ... */) {

    val emails by lazy { loadEmails(this) }
}







// lazy is a special case of property delegation
//end::content[]
