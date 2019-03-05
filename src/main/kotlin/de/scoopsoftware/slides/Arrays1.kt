package de.scoopsoftware.slides.a1

//tag::content[]
//tag::main-start[]
fun main(args: Array<String>) {
//end::main-start[]

//tag::ex1[]
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers.toList())                     // [1, 2, 3, 4, 5]

//end::ex1[]
//tag::ex2[]
    val nulls = arrayOfNulls<Int>(4)
    println(nulls.joinToString())                 // null, null, null, null

//end::ex2[]
//tag::ex3[]
    val bytes = byteArrayOf(83, 99, 111, 111, 112)
    println(String(bytes))                        // Scoop

//end::ex3[]
//tag::ex4[]
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())               // 1, 4, 9, 16, 25

//end::ex4[]
//tag::ex5[]
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))             // abcdefghijklmnopqrstuvwxyz

//end::ex5[]
//tag::ex6[]
    val names = arrayOf("Alice", "Bob", "Carol")
    names.forEachIndexed { index, name ->         // 1: Alice
        println("${index+1}: $name")              // 2: Bob
    }                                             // 3: Carol
//end::ex6[]
//tag::main-end[]
}
//end::main-end[]
//end::content[]
