package money

abstract class Money(amount: Int) {
    protected var amount: Int = amount

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        return when (other is Money) {
            true -> amount == other.amount && this::class == other::class
            false -> false
        }
    }

    companion object Factory {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }
}