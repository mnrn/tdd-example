package money

import org.junit.Test
import kotlin.test.assertEquals

class MoneyTest {
    @Test
    fun testMultiplication() {
        var five = Dollar(5)

        var product = five.times(2)
        assertEquals(10, product.amount)

        product = five.times(3)
        assertEquals(15, product.amount)
    }
}