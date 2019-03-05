@file:JvmName("ServerMain")
package de.scoopsoftware.slides

import io.javalin.Javalin
import java.util.Random

fun main(args: Array<String>) {
    val rnd = Random(12345)
    val app = Javalin.start(7000)
    // tag::post[]
    app.post("/tasks/:id/execute") { ctx ->
        val taskId = ctx.param("id")
        val millis = rnd.nextInt(5000).toLong()
        Thread.sleep(millis)
        val msg = "Task: #$taskId executed in $millis ms."
        println(msg)
        ctx.result(msg)
    }
    // end::post[]
}
