package money

class CurrencyPair(private val from: String, private val to: String) {

    override fun equals(other: Any?): Boolean {
        require(other is CurrencyPair) { "other must be CurrencyPair." }
        return from.equals(other.from) && to.equals(other.to)
    }

    override fun hashCode(): Int {
        return 0
    }
}