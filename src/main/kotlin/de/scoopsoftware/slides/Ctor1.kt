package de.scoopsoftware.slides.c1


// class User(val nickname: String, val isSubscribed: Boolean = true)

open class User(val nickname: String) { /*...*/ }
class TwitterUser(nickname: String) : User(nickname) { /*...*/ }

open class Button // default constructor

class RadioButton: Button()


class MenuItem(val name: String,
               var enabled: Boolean=true,
               var checked: Boolean=false)

class Secretive private constructor()

//tag::count[]
open class Counter {
    var count: Int = 0
        protected set
    fun increment() = ++count
}
//end::count[]

class DecrementableCounter: Counter() {
    fun decrement() = --count
}

//tag::rect[]
class Point(val x: Int, val y: Int)

class Rectangle(val x1: Int, val y1: Int, val x2: Int, val y2: Int) { // primary constructor
    constructor(p1: Point, p2: Point): this(p1.x, p1.y, p2.x, p2.y)   // secondary constructor
}
//end::rect[]

//tag::main[]
fun main(args: Array<String>) {
    val c = Counter()
    c.increment()
    println("count: ${c.count}")  // count: 1
//    c.count = 3                 // doesn't compile

    val d = DecrementableCounter()
    d.decrement()
    println("count: ${d.count}")  // count: -1
}
//end::main[]
