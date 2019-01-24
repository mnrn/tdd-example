package money

import kotlin.collections.HashMap

class Bank {
    private var rates = HashMap<CurrencyPair, Int>()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[CurrencyPair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        if (from.equals(to)) {
            return 1
        } 
        else {
            check(rates.containsKey(CurrencyPair(from, to))) 
            return rates.getValue(CurrencyPair(from, to))
        }
    }
}