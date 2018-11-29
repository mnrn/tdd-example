package money

open class Money(amount: Int) {
    protected var amount: Int = amount

    override fun equals(other: Any?): Boolean {
        return when (other is Money) {
            true -> amount == other.amount
            false -> false
        }
    }
}