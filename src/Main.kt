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

    println("Jane buys 3 of Soda. Print Jane Cash on hand. Print quantity of Soda.")
    println()
    println(soda.getQuantity())
    println(jane.cash)
    println(jane.buySnacks(soda.buySnack(3)))
    println(soda.getQuantity())
    println()

    println("Jane buys 1 of Pretzel. Print Jane Cash on hand. Print quantity of Pretzel.")
    println()
    println(pretzels.getQuantity())
    println(jane.cash)
    println(jane.buySnacks(pretzels.buySnack(1)))
    println(pretzels.getQuantity())

    println("Bob buys 2 of Soda. Print Bob Cash on Hand. Print quantity of Soda.")
    println()
    println(soda.getQuantity())
    println(bob.cash)
    println(bob.buySnacks(soda.buySnack(2)))
    println(soda.getQuantity())
    println()


    println("Jane finds $10. Print Jane Cash on Hand.")
    println()
    println(jane.addCash(10.0))
    println(println("Jane Finds Ten Dollars"))
    println(jane.cash)
    println()

    println("Jane buys 1 of Chocolate Bar. Print Jane Cash on Hand. Print quantity of Chocolate Bar.")
    println()
    println(chocolateBar.getQuantity())
    println(jane.cash)
    println(jane.buySnacks(chocolateBar.buySnack(1)))
    println(chocolateBar.getQuantity())
    println()

    println("Snack 3 gets 12 more. Print quantity of Pretzel.")
    println()
    println(pretzels.getQuantity())
    println(pretzels.addQuantity(12))
    println()

    println("Bob buys 3 of Pretzel. Print Bob Cash on hand. Print quantity of Pretzel.")
    println()
    println(pretzels.getQuantity())
    println(bob.cash)
    println(bob.buySnacks(pretzels.buySnack(3)))
    println(pretzels.getQuantity())
}