package money

class Sum(augend: Money, addend: Money): Expression {
    internal val augend = augend
    internal val addend = addend

    override fun reduce(to: String): Money {
        val amount = augend.amount() + addend.amount()
        return Money(amount, to)
    }
}