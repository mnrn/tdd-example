package money

class CurrencyPair(private val from: String, private val to: String) {

    override fun equals(other: Any?): Boolean {
        val pair = checkNotNull(other){ "other must be not null." } as CurrencyPair
        return from.equals(pair.from) && to.equals(pair.to)
    }

    override fun hashCode(): Int {
        return 0
    }
}