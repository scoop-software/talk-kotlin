package de.scoopsoftware.slides.o2

//tag::content[]
object Logger {
    val context = mutableMapOf<String,String>()
    fun log(message: String) {
        println("$context: $message")
    }
}



fun main(args: Array<String>) {
    Logger.context["thread"] = "worker-7"
    Logger.context["txID"] = "dead-b055-1234"
    Logger.log("Account successfully deleted")
    // Output: {thread=worker-7, txID=dead-b055-1234}: Account successfully deleted
}
//end::content[]
