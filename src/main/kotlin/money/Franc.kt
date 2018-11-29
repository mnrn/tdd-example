package money

class Franc(amount: Int) {

    private val amount :Int = amount

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return when (other is Franc) {
            true -> amount == other.amount
            false -> false
        }
    }
}