package de.scoopsoftware.slides.op1

//tag::content[]
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
    var p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)    // Point(x=40, y=60)

    p1 += p2
    println(p1)         // Point(x=40, y=60)
}
//end::content[]
