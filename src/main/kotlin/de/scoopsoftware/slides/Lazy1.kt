package de.scoopsoftware.slides.lazy1

//tag::content[]
class Email {/* ... */}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String /* ... */) {

    val emails: List<Email> = loadEmails(this)
}







// emails will be loaded even if they are not required
//end::content[]
