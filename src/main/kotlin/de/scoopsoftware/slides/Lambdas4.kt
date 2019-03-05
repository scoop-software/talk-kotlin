package de.scoopsoftware.slides.l4

//tag::content[]
fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun main(args: Array<String>) {
    println(alphabet())
// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// Now I know the alphabet!
}
//end::content[]
