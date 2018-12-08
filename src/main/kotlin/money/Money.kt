package money

open class Money(amount: Int, currency: String): Expression {
    private val amount = amount
    private val currency = currency

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun plus(addend: Money): Expression{
        return Sum(this, addend)
    }

    override fun reduce(to: String): Money {
        return this
    }

    fun currency(): String = currency
    fun amount(): Int = amount

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
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }
}