package de.scoopsoftware.slides.co1

//tag::content[]
import kotlin.math.*

data class Point (val x: Double, val y: Double)

fun fromPolar(r: Double, phi: Double) = Point(r * cos(phi), r * sin(phi))




fun main(args: Array<String>) {
    println(Point(3.0, 4.0))
    println(fromPolar(5.0, PI / 3))
}
//tag::content[]
