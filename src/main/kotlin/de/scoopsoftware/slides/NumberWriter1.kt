package de.scoopsoftware.slides.v1

//tag::content[]
import java.util.*
import kotlin.math.PI

fun write(value: Double, decimals: Int,
          prefix: String, suffix: String, locale: Locale) {
    println("${prefix}%.${decimals}f${suffix}".format(locale, value))
}

fun main(args: Array<String>) {
    write(PI, 5, "length = ",
            " cm.", Locale.GERMANY)           // length = 3,14159 cm.
    write(PI, 4, "", " cm.", Locale.US)       // 3.1416 cm.
    write(PI, 2, "", "", Locale.GERMANY)      // 3,14
    write(PI, 2, "", "", Locale.US)           // 3.14
}
//end::content[]
