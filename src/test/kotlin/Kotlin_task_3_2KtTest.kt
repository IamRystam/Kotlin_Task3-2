import org.junit.Assert.*

class Kotlin_task_3_2KtTest {

    @org.junit.Test
    fun payment_VISA_if_Commission_35() {
        val accountTest = "Visa"
        val previousPaymentsTest = 0
        val payTest = 10000
        val correctPayment = 7500

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

      assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_VISA_if_Commission_Less35() {
        val accountTest = "Visa"
        val previousPaymentsTest = 0
        val payTest = 100
        val correctPayment = 3500

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_MIR() {
        val accountTest = "Мир"
        val previousPaymentsTest = 0
        val payTest = 100
        val correctPayment = 3500

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_VK_pay() {
        val accountTest = "VK pay"
        val previousPaymentsTest = 0
        val payTest = 10000
        val correctPayment = 0

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_Mastercard_If_previousPayments_Less_75_000() {
        val accountTest = "Mastercard"
        val previousPaymentsTest = 10000
        val payTest = 1000
        val correctPayment = 0

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_Mastercard_If_previousPayments_more_75_000() {
        val accountTest = "Mastercard"
        val previousPaymentsTest = 80000
        val payTest = 1000
        val correctPayment = 2600

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
    @org.junit.Test
    fun payment_Maestro() {
        val accountTest = "Maestro"
        val previousPaymentsTest = 80000
        val payTest = 1000
        val correctPayment = 2600

        val pay10 =  payment(
            account = accountTest,
            previousPayments = previousPaymentsTest,
            payRub = payTest)

        assertEquals(correctPayment,pay10)
    }
}