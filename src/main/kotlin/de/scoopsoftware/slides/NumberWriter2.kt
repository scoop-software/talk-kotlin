package de.scoopsoftware.slides.v2

//tag::content[]
import java.util.*
import kotlin.math.PI

fun write(value: Double, decimals: Int = 2,
          prefix: String = "", suffix: String = "", locale: Locale = Locale.US) {
    println("${prefix}%.${decimals}f${suffix}".format(locale, value))
}

fun main(args: Array<String>) {
    write(PI, 5, "length = ",
            " cm.", Locale.GERMANY)           // length = 3,14159 cm.
    write(PI, 4, "", " cm.")                  // 3.1416 cm.
    write(PI, 2, "", "", Locale.GERMANY)      // 3,14
    write(PI)                                 // 3.14
}
//end::content[]
