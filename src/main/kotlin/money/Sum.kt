package money

class Sum(internal val augend: Money, internal val addend: Money): Expression {

    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.amount() + addend.amount()
        return Money(amount, to)
    }
}