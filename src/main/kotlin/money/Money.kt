package money

open class Money(amount: Int, currency: String) {
    private val amount: Int = amount
    private val currency: String = currency

    open fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        return when (other is Money) {
            true -> amount == other.amount && currency() == other.currency()
            false -> false
        }
    }

    override fun toString(): String {
        return amount.toString() + " " + currency
    }

    companion object Factory {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }
}