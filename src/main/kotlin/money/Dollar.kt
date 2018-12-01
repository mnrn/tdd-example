package money

class Dollar(amount: Int): Money(amount) {
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}