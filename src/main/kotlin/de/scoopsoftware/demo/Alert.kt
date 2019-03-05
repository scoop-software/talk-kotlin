package de.scoopsoftware.demo

/*sealed*/ open class Alert
class Email(val recipient: String, val title: String, val body: String) : Alert()
class SMS(val cc: Int, val ndc: Int, val sn: Int, val message: String) : Alert()
//class Beep(val seconds: Int): Alert()

fun getAckMessage(alert: Alert) =
    when(alert) {
        is Email -> "Email with title '${alert.title}' sent to ${alert.recipient}: ${alert.body}"
        is SMS -> "SMS sent to ++(${alert.cc})${alert.ndc}-${alert.sn}: ${alert.message}"
//        is Beep -> "Beep for ${alert.seconds} seconds"
        else -> throw AssertionError("Unknown alert type")
    }

fun main(args: Array<String>) {
    println(getAckMessage(Email("nobody@nowhere.net", "Epic fail", "Your server exploded")))
    println(getAckMessage(SMS(49, 171, 47110815, "Godzilla is back in town")))
//    println(getAckMessage(Beep(5)))
}
