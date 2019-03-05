package de.scoopsoftware.slides.e1

//tag::content[]
fun getEmailUser(email: String): String {
    val user =
            if(email.contains('@'))
                email.substringBefore('@')
            else
                throw IllegalArgumentException()
    return user.toLowerCase()
}

fun main(args: Array<String>) {
    println(getEmailUser("John.Smith@example.org")) // john.smith
    println(getEmailUser("I have no email"))        // throws IllegalArgumentException
}
//end::content[]
