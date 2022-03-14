var account = "VK pay"
var previousPayments = 0

fun main() {
    payment("Mastercard", 10000, 100)
}

fun payment(account: String, previousPayments: Int, pay: Int) {
    val pay = pay * 100
    val paymentCommission: Double



    when (account) {
        "VK pay" -> println("Коммисия за перевод отсутствует")
        "Visa", "Мир" -> {
            paymentCommission = if (pay * 0.0075 > 3500) ((pay * 0.0075) / 100) else 35.00
            println("Коммисия за перевод составила: $paymentCommission рублей")
        }
        "Mastercard", "Maestro" -> {
            paymentCommission = if (previousPayments < 75000) 0.0 else (((pay * 0.006) + 2000) / 100)
            println("Коммисия за перевод составила: $paymentCommission рублей ")
        }
    }
}