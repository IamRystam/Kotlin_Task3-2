fun main() {
    val plot = payment(account = "Visa", previousPayments = 10000, payRub = 10000)
    println("Коммисия за перевод составила: $plot копеек ")
}

fun payment(account: String, previousPayments: Int = 0, payRub: Int): Int {
    val pay = payRub * 100
    var paymentCommission = 0
    val commissionVisaMir = pay * 0.0075

    when (account) {
        "VK pay" -> paymentCommission

        "Visa", "Мир" -> {
            paymentCommission = if (commissionVisaMir > 3500) commissionVisaMir.toInt() else 3500

        }
        "Mastercard", "Maestro" -> {
            paymentCommission = if (previousPayments < 75000) 0 else ((pay * 0.006) + 2000).toInt()

        }
    }
    return paymentCommission
}
