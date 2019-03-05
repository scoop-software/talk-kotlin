package de.scoopsoftware.slides

// tag::main[]
fun main(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "world"
    var sender = "not important"
    if(args.size > 1) sender = args[1]
    println("""Hello, $name,
        |My name is $sender.
        |I need your help.
    """.trimMargin())
}
// end::main[]
