package de.scoopsoftware.slides.v6

//tag::content[]
open class Animal(val name: String) {
    fun feed() = println("$name is no longer hungry")
}

class Cat(name: String, var hairColor: String? = null): Animal(name)

class Herd<in T: Animal>(val list: MutableList<in T>) { // declaration-site variance
    fun accept(member: T) = list.add(member)
}

fun addGarfield(herd: Herd<Cat>) {
    herd.accept(Cat("Garfield", "orange"))
}

fun main(args: Array<String>) {
    val animals = Herd<Animal>(mutableListOf())
    val cats = Herd<Cat>(mutableListOf())

    addGarfield(animals)
    addGarfield(cats)
}
//end::content[]
