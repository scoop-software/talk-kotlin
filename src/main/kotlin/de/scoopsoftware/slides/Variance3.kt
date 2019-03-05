package de.scoopsoftware.slides.v3

//tag::content[]
open class Animal(val name: String) {
    fun feed() = println("$name is no longer hungry")
}

class Cat(name: String, var hairColor: String? = null): Animal(name)

class Herd<out T: Animal>(val list: List<T>) {           // declaration-site variance
    fun get(name: String): T = list.first{it.name == name}
}

fun feedByName(name: String, herd: Herd<Animal>) {
    herd.get(name).feed()
}

fun main(args: Array<String>) {
    val animals = Herd(listOf(Animal("Unicorn"), Animal("Godzilla")))
    val cats = Herd(listOf(Cat("Nala"), Cat("Sammy", "orange")))

    feedByName("Godzilla", animals)
    feedByName("Sammy", cats)
}
//end::content[]
