package de.scoopsoftware.slides

//tag::content[]
sealed class Alert
class Email(val recipient: String, val title: String, val body: String) : Alert()
class SMS(val cc: Int, val ndc: Int, val sn: Int, val message: String) : Alert()

fun getAckMessage(alert: Alert) =
    when(alert) {
        is Email -> "Email with title '${alert.title}' sent to ${alert.recipient}: ${alert.body}"
        is SMS -> "SMS sent to ++(${alert.cc})${alert.ndc}-${alert.sn}: ${alert.message}"
    }


fun main(args: Array<String>) {
    println(getAckMessage(Email("nobody@nowhere.net", "Epic fail", "Your server exploded")))
        // Email with title 'Epic fail' sent to nobody@nowhere.net: Your server exploded

    println(getAckMessage(SMS(49, 171, 47110815, "Godzilla is back in town")))
        // SMS sent to ++(49)171-47110815: Godzilla is back in town
}
//end::content[]
