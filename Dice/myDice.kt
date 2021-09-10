fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
    
    val mySecDice = Dice(20)
    println("Your ${mySecDice.numSides} sided dice rolled ${mySecDice.roll()}")
    
}
class Dice(val numSides: Int) {
    
    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
                
    }
    }
