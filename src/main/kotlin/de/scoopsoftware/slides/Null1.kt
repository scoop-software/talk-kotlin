package de.scoopsoftware.slides.n1

//tag::strLen[]
fun strLen(s: String): Int = s.length
//end::strLen[]

//tag::strLenErr[]
// fun strLenSafe(s: String?): Int = s.length // compile error: Only safe (?.) or
//             non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
//end::strLenErr[]

//tag::strLenSafe[]
fun strLenSafe(s: String?): Int = if(s != null) s.length else 0
//end::strLenSafe[]


//tag::main-start[]

fun main(args: Array<String>) {
//end::main-start[]

//tag::strLen1[]
    println(strLen("Hello"))  // 5
//    println(strLen(null))   // compile error: Null can not be a value of a non-null type String
//end::strLen1[]

//tag::strLenSafe1[]
    println(strLenSafe("Hello"))  // 5
    println(strLenSafe(null))     // 0
//end::strLenSafe1[]

//tag::main-end[]
}
//end::main-end[]
