package de.scoopsoftware.slides.d3

//tag::content[]
import kotlin.math.*

class Point(val x: Double, val y: Double) {
    operator fun component1() = x
    operator fun component2() = y
}
fun fromPolar(r: Double, phi: Double) = Point(r * cos(phi), r * sin(phi))

fun main(args: Array<String>) {
    val (x1, y1) = fromPolar(4.0, PI / 5)
    val (x2, y2) = fromPolar(3.0, 7 * PI / 10)
    val dx = x2 - x1
    val dy = y2 - y1
    val d = sqrt(dx * dx + dy * dy)
    println("distance = $d")  // distance = 5.0
}
//end::content[]
