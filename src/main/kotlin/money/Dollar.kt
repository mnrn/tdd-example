package money

class Dollar(amount: Int) {

    var amount :Int = amount
    fun times(multiplier: Int) {
        amount *= multiplier
    }
}