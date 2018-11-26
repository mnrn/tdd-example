package money

class Dollar(amount: Int) {

    var amount :Int = amount

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return when (other is Dollar) {
            true -> amount == other.amount
            false -> false
        }
    }
}