package de.scoopsoftware.slides.c3

//tag::rect[]
class Point(val x: Int, val y: Int)

class Rectangle(p1: Point, p2: Point) { // primary constructor
    val x1: Int
    val y1: Int
    val x2: Int
    val y2: Int
    init {                              // initializer block
        x1 = p1.x
        y1 = p1.y
        x2 = p2.x
        y2 = p2.y
    }
}
//end::rect[]
