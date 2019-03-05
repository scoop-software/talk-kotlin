package de.scoopsoftware.slides.op4

//tag::content[]
data class Point(val x: Int, val y: Int)

operator fun Point.get(index: Int) = when(index) {
    0 -> x
    1 -> y
    else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}







fun main(args: Array<String>) {
    val p = Point(10, 20)

    println(p[1])    // 20
}
//end::content[]
