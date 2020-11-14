package com.amar.kotlinlists

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name;
    }
}

class Vegetables(private vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()){
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString();
        }
    }
}

class Order(val orderNumber: Int){
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }

    fun print(){
        println("Order #$orderNumber")
        var total = 0
        for (item in itemList){
            println("${item}: Rs.${item.price}")
            total += item.price
        }
        println("Total: Rs.$total")
    }
}

fun main() {
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    println(noodles)
    println(vegetables)
    println(vegetables2)

    val ordersList = mutableListOf<Order>()

    ordersList.add(Order(1).addItem(Noodles()))

    ordersList.add(
            Order(2)
                    .addItem(Noodles())
                    .addItem(Vegetables()))

    ordersList.add(
            Order(3)
                    .addAll(listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))))

    for (order in ordersList) {
        order.print()
        println()
    }
}

main()

