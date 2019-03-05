package de.scoopsoftware.slides.l5

//tag::content[]
fun alphabet(): String =
    with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }

fun main(args: Array<String>) {
    println(alphabet())
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// Now I know the alphabet!
}
//end::content[]
