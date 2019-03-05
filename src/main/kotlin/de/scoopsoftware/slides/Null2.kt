package de.scoopsoftware.slides.n2

//tag::content[]
class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName() = this.company?.address?.country ?: "Unknown"

fun main(args: Array<String>) {
    val michael = Person("Michael", Company("SCOOP",
            Address("Eiler Straße 3P", 51107, "Köln", "Germany")))
    val dilbert = Person("Dilbert", null)
    println(michael.countryName())  // Germany
    println(dilbert.countryName())  // Unknown
}
//end::content[]
