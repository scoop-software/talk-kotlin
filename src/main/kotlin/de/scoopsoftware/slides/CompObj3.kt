package de.scoopsoftware.slides.co3

//tag::content[]
import kotlin.math.*

data class Point private constructor(val x: Double, val y: Double) {
    companion object {
        fun fromCartesian(x: Double, y: Double) = Point(x, y)
        fun fromPolar(r: Double, phi: Double) = Point(r * cos(phi), r * sin(phi))
    }
}

fun main(args: Array<String>) {
    println(Point.fromCartesian(3.0, 4.0))
    println(Point.fromPolar(5.0, PI / 3))
}
//tag::content[]
