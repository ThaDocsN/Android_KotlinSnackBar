class Snack(val id: Int, val name: String, private var quantity: Int, var cost: Double, val vendingMachineID: Int) {

    fun getQuantity() = "the quantity of $name is now $quantity"

    fun addQuantity(num: Int): String {
        quantity += num
        return "quantity is now $quantity"
    }
}
class VendingMachine(val id: Int, val name: String) {

    fun printId() = "Machine id is $id"

    fun printName() = "Machine name is $name"

}

class Customer(val id: Int, val name: String, var cash: Double) {

    fun addCash(num: Double) {
        cash += num

    }

    fun buySnacks(cost: Double) {
        cash -= cost
    }

    fun saveName() =
        "Name is $name"

    var isBroke: Boolean = false
        set(isBroke) { cash <= 0.0}
}