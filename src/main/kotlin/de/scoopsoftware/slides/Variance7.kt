package de.scoopsoftware.slides.v7

//tag::content[]
open class Animal(val name: String) { fun feed() = println("$name is no longer hungry") }
class Cat(name: String, var hairColor: String? = null): Animal(name)

interface Producer<out T> { fun get(name: String): T }
interface Consumer<in T> { fun accept(member: T) }
class Herd<T: Animal>(val list: MutableList<T>): Producer<T>, Consumer<T> {
    override fun accept(member: T) { list.add(member) }
    override fun get(name: String): T = list.first{it.name == name}
}

fun feedByName(name: String, herd: Producer<Animal>) {
    herd.get(name).feed()
}
fun addGarfield(herd: Consumer<Cat>) {
    herd.accept(Cat("Garfield", "orange"))
}

fun main(args: Array<String>) {
    val animals = Herd<Animal>(mutableListOf(Animal("Unicorn"), Animal("Godzilla")))
    val cats = Herd<Cat>(mutableListOf(Cat("Nala"), Cat("Sammy", "orange")))

    feedByName("Godzilla", animals)
    feedByName("Sammy", cats)

    addGarfield(animals)
    addGarfield(cats)
}
//end::content[]
