package de.scoopsoftware.slides.pf2

import de.scoopsoftware.slides.java.User

//tag::content[]
// Kotlin
class UpperUser(id: String): User(id) {
    override fun getId(): String = super.getId().toUpperCase()

    override fun getEmail(): String? = super.getEmail()?.toUpperCase()
    override fun setEmail(email: String?) {
        super.setEmail(email?.toUpperCase())
    }
}
//end::content[]
