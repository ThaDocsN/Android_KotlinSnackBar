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