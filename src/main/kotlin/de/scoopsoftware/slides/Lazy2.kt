package de.scoopsoftware.slides.lazy2

//tag::content[]
class Email {/* ... */}

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String /* ... */) {
    private var nullableEmails: List<Email>? = null
    val emails: List<Email>
        get() {
            if (nullableEmails == null) {
                nullableEmails = loadEmails(this)
            }
            return nullableEmails!!
        }
}

// not thread-safe
//end::content[]
