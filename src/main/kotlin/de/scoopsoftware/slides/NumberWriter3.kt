package de.scoopsoftware.slides.v3

//tag::content[]
import java.util.*
import kotlin.math.PI

fun write(value: Double, decimals: Int = 2,
          prefix: String = "", suffix: String = "", locale: Locale = Locale.US) {
    println("${prefix}%.${decimals}f${suffix}".format(locale, value))
}

fun main(args: Array<String>) {
    write(PI, locale = Locale.GERMANY, prefix = "length = ",
            suffix = " cm.", decimals = 5)   // length = 3,14159 cm.
    write(PI, decimals = 4, suffix = " cm.") // 3.1416 cm.
    write(PI, locale = Locale.GERMANY)       // 3,14
    write(PI)                                // 3.14
}
//end::content[]
