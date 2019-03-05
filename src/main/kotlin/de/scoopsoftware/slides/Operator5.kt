package de.scoopsoftware.slides.op5

//tag::content[]
data class Point(var x: Int, var y: Int)

operator fun Point.get(index: Int) = when(index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

operator fun Point.set(index: Int, value: Int) = when(index) {
    0 -> x = value
    1 -> y = value
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    p[1] = 42
    println(p[1])    // 42
}
//end::content[]
