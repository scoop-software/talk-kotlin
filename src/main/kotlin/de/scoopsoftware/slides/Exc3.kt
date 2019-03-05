package de.scoopsoftware.slides.e3

//tag::content[]
fun getEmailUser(email: String): String {
    val user = if(email.contains('@')) email.substringBefore('@')
               else throw IllegalArgumentException()
    return user.toLowerCase()
}

fun printEmailUser(email: String) {
    val user = try {
        getEmailUser(email)
    } catch(e: Exception) {
        "unknown"
    }
    println(user)
}

fun main(args: Array<String>) {
    printEmailUser("John.Smith@example.org")        // john.smith
    printEmailUser("I have no email")               // unknown
}
//end::content[]
