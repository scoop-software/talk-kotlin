package de.scoopsoftware.slides

// tag::vararg[]
fun max(vararg numbers: Int) =
        numbers.reduce{max, e -> if(max > e) max else e}
// end::vararg[]

// tag::when[]
fun display(input: Any) {
    when(input) {
        10 -> println("ten")
        11, 12 -> println("eleven or twelve")
        in 1 .. 9 -> println("a single-digit number")
        is String -> println("a string with length ${input.length}")
        else -> println("something else")
    }
}
// end::when[]


/*
// tag::omitted[]
...
...
...
// end::omitted[]
*/
// tag::main[]

fun main(args: Array<String>) {

// tag::vararg-demo[]
    println(max(5, 3, 7, 2))                     // 7
    val values = intArrayOf(6, 9, 1, 8)
    println(max(5, 3, *values, 7, 2))            // 9

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray())) // a/b/c
// end::vararg-demo[]

// tag::loop1[]
    for(i in 1 .. 10) { // 1 2 3 4 5 6 7 8 9 10
        print(" $i")
    }
// end::loop1[]
    println()
// tag::loop2[]
    for(i in 1 until 10) { // 1 2 3 4 5 6 7 8 9
        print(" $i")
    }
// end::loop2[]
    println()
// tag::loop3[]
    for(i in 10 downTo 1 step 2) { // 10 8 6 4 2
        print(" $i")
    }
// end::loop3[]
    println()

// tag::while[]
    var j = 0
    while(j++ < 5) print(" $j") // 1 2 3 4 5
// end::while[]
    println()

// tag::do-while[]
    var k = 0
    do print(" $k") while(k++ < 5) // 0 1 2 3 4 5
// end::do-while[]
    println()

// tag::when-demo[]
    display(10)                  // ten
    display(12)                  // eleven or twelve
    display(5)                   // a single-digit number
    display("Hello")             // a string with length 5
    display(42)                  // something else
    display(RuntimeException())  // something else
// end::when-demo[]


}
// end::main[]
