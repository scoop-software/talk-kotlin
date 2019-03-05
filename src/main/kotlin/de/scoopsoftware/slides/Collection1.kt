package de.scoopsoftware.slides.c1

import java.io.BufferedReader

//tag::read-numbers[]
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        result.add(line.toIntOrNull())
    }
    return result
}
//end::read-numbers[]

//tag::add-valid-numbers[]
fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}
//end::add-valid-numbers[]

//tag::examples[]
fun main(args: Array<String>) {
    val mlist = mutableListOf(3, 6, 7)
    mlist[0] = 1
    println(mlist)                        // [1, 6, 7]

    val list = listOf(3, 6, 7)
//    list[0] = 1                         // doesn't compile
    println(list.filter { it % 2 == 1 })  // [3, 7]

    val map = mutableMapOf(1 to "Alice", 2 to "Bob")
    println(map[1]?.toUpperCase())        // ALICE
}
//end::examples[]
