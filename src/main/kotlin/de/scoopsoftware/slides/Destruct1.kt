package de.scoopsoftware.slides.d1

//tag::content[]
import kotlin.math.*

data class Point(val x: Double, val y: Double)



fun fromPolar(r: Double, phi: Double) = Point(r * cos(phi), r * sin(phi))

fun main(args: Array<String>) {
    val p1 = fromPolar(4.0, PI / 5)
    val p2 = fromPolar(3.0, 7 * PI / 10)
    val dx = p2.x - p1.x
    val dy = p2.y - p1.y
    val d = sqrt(dx * dx + dy * dy)
    println("distance = $d")  // distance = 5.0
}
//end::content[]
