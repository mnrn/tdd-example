package money

interface Expression {
    fun reduce(to: String): Money
}