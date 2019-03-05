package de.scoopsoftware.slides.n4

//tag::content[]
class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person?.hasEmployer() = (this != null) && (this.company != null)

fun checkEmployment(p: Person?) {
    println(if(p.hasEmployer()) "employed" else "unemployed")
}

fun main(args: Array<String>) {
    val michael = Person("Michael", Company("SCOOP",
            Address("Eiler Straße 3P", 51107, "Köln", "Germany")))
    val dilbert = Person("Dilbert", null)
    checkEmployment(michael)  // employed
    checkEmployment(dilbert)  // unemployed
    checkEmployment(null)     // unemployed
}
//end::content[]
