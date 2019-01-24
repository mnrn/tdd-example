package money

class CurrencyPair(private val from: String, private val to: String) {

    override fun equals(other: Any?): Boolean {
        val pair = other as CurrencyPair
        return from.equals(pair.from) && to.equals(pair.to)
    }

    override fun hashCode(): Int {
        return 0
    }
}