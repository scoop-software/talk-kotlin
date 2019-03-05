@file:JvmName("HelloWeb")
package de.scoopsoftware.demo

import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.start(7000)
    app.get("/hello/:name") { ctx ->
        val name = ctx.param("name")
        ctx.result("Hello, $name!")
    }
}
