fun main(){

    val jane = Customer(1, "Jane", 45.25)
    val bob = Customer(2,"Bob", 33.14)

    val food = VendingMachine(1, "Food")
    val drink = VendingMachine( 2, "Drink")
    val office = VendingMachine(3, "Office")

    val chips = Snack(1, "Chips", 36, 1.75, 1)
    val chocolateBar = Snack(2, "Chocolate Bar", 36, 1.00, 1)
    val pretzels = Snack(3, "Pretzel", 30, 2.00, 1)

    val soda = Snack(4, "Soda", 24, 2.50, 2)
    val water = Snack(5, "Water", 20,2.75, 2)
}