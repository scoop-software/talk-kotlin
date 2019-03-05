package de.scoopsoftware.demo

fun main(args: Array<String>) {
    val name = if(args.isEmpty()) "world" else args[0]
    val sender = "John"
    println("""Hello, $name!
        |My name is $sender
        |and I need your help
    """.trimMargin())
}
