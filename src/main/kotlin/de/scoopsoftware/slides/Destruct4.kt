package de.scoopsoftware.slides.d4

//tag::map[]
fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}
//end::map[]

//tag::list[]
fun printWithIndex(list: List<*>) {
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}
//end::list[]

//tag::split[]
fun splitFilename(fullName: String) {
    val (name, extension) = fullName.split('.', limit = 2)
    println("name: $name, extension: $extension")
}
//end::split[]

//tag::mainstart[]

fun main(args: Array<String>) {
//end::mainstart[]
//tag::split1[]
    splitFilename("scoop.kt")
//end::split1[]
/*
//tag::splitout[]
name: scoop, extension: kt
//end::splitout[]
*/

//tag::list1[]
    printWithIndex(listOf("Zero", "One", "Two"))
//end::list1[]
/*
//tag::listout[]
     0: Zero
     1: One
     2: Two
//end::listout[]
 */
//tag::map1[]
    printEntries(mapOf(
            "040" to "Hamburg",
            "0221" to "Köln",
            "0611" to "Wiesbaden"
    ))
//end::map1[]
/*
//tag::mapout[]
040 -> Hamburg
0221 -> Köln
0611 -> Wiesbaden
//end::mapout[]
 */

//tag::mainend[]
}
//end::mainend[]
