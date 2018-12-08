package money

class CurrencyPair(private val from: String, private val to: String) {

    override fun equals(other: Any?): Boolean {
        return when (other is CurrencyPair) {
            true -> from.equals(other.from) && to.equals(other.to)
            false -> false
        }
    }

    override fun hashCode(): Int {
        return 0
    }
}