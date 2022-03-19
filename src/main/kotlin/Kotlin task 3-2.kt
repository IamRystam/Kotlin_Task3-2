var account = "VK pay"
var previousPayments = 0

fun main() {
    val plot = payment("Visa", 10000, 10000)
    println("Коммисия за перевод составила: $plot копеек ")
}

fun payment(account: String, previousPayments: Int, payRub: Int): Int {
    val pay = payRub * 100
    var paymentCommission = 0

    when (account) {
        "VK pay" -> paymentCommission

        "Visa", "Мир" -> {
            paymentCommission = if (pay * 0.0075 > 3500) ((pay * 0.0075).toInt()) else 3500

        }
        "Mastercard", "Maestro" -> {
            paymentCommission = if (previousPayments < 75000) 0 else ((pay * 0.006) + 2000).toInt()

        }
    }
    return paymentCommission
}
