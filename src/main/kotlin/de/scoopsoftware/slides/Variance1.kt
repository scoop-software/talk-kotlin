package de.scoopsoftware.slides.v1

//tag::content[]
open class Animal(val name: String) {
    fun feed() = println("$name is no longer hungry")
}

class Cat(name: String, var hairColor: String? = null): Animal(name)

class Herd<T: Animal>(val list: List<T>) {
    fun get(name: String): T = list.first{it.name == name}
}

fun feedByName(name: String, herd: Herd<Animal>) {
    herd.get(name).feed()
}

fun main(args: Array<String>) {
    val animals = Herd(listOf(Animal("Unicorn"), Animal("Godzilla")))
    val cats = Herd(listOf(Cat("Nala"), Cat("Sammy", "orange")))

    feedByName("Godzilla", animals)
//    feedByName("Sammy", cats)        // compile error: Type mismatch
}
//end::content[]
