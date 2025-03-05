package ie.setu.donationx.data

import java.util.Date
import kotlin.random.Random

data class DonationModel(val id: Int = Random.nextInt(1, 100000),
                         val paymentType: String = "N/A",
                         val paymentAmount: Int = 0,
                         val message: String = "Go Homer!",
                         val dateDonated: Date = Date()
)

val fakeDonations = List(30) { i ->
    DonationModel(id = 12345 + i,
        "PayPal $i",
        i.toInt(),
        "Message $i",
        Date()
    )
}