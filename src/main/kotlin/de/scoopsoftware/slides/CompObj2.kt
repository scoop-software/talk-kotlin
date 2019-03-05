package de.scoopsoftware.slides.co2

//tag::content[]
import kotlin.math.*

data class Point private constructor(val x: Double, val y: Double) {
    object Factory {
        fun fromCartesian(x: Double, y: Double) = Point(x, y)
        fun fromPolar(r: Double, phi: Double) = Point(r * cos(phi), r * sin(phi))
    }
}

fun main(args: Array<String>) {
    println(Point.Factory.fromCartesian(3.0, 4.0))
    println(Point.Factory.fromPolar(5.0, PI / 3))
}
//tag::content[]
