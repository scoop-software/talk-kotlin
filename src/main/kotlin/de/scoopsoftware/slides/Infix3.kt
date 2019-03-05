package de.scoopsoftware.slides.ifx3

fun main(args: Array<String>) {
//tag::set0[]
    val s1 = setOf("aaa", "bbb")
    val s2 = setOf("bbb", "ccc")
//end::set0[]
//tag::set1[]
    println(s1.union(s2))   // [aaa, bbb, ccc]
//end::set1[]
//tag::set2[]
    println(s1 union s2)    // [aaa, bbb, ccc]
//end::set2[]

//tag::for1[]
    for(i in 1 until 10 step 2) print("$i ")   // 1 3 5 7 9
//end::for1[]
    println()
//tag::for2[]
    for(i in 1.until(10).step(2)) print("$i ") // 1 3 5 7 9
//end::for2[]
    println()

//tag::map1[]
    println(mapOf(1 to "Alice", 2 to "Bob"))   // {1=Alice, 2=Bob}
//end::map1[]
//tag::map2[]
    println(mapOf(1.to("Alice"), 2.to("Bob"))) // {1=Alice, 2=Bob}
//end::map2[]
}
