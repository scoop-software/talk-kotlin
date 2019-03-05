package de.scoopsoftware.slides

// tag::main[]
fun main(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "world"
    val sender = if(args.size > 1) args[1] else "not important"
    println("""Hello, $name,
        |My name is $sender.
        |I need your help.
    """.trimMargin())
}
// end::main[]
