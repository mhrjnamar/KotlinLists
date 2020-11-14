package com.amar.kotlinlists

fun main() {

    // While Loop
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0;
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")

    // For Loop
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names) {
        println("$name - Number of characters: ${name.length}")
    }

    // For Loop Test
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    for (number in 5 downTo 1){
       // println(number)
    }

    for (number in 1..7 step 3){
        println(number)
    }
}

main()

/**
Note: Here are some other variations of what you can do with for loops, including using them with ranges with specific steps (instead of incrementing by 1 each time).

for (item in list) print(item) // Iterate over items in a list

for (item in 'b'..'g') print(item) // Range of characters in an alphabet

for (item in 1..5) print(item) // Range of numbers

for (item in 5 downTo 1) print(item) // Going backward

for (item in 3..6 step 2) print(item) // Prints: 35

Note: A loop is a control flow structure like the if / else and when expressions you learned earlier because it dictates a particular flow for how the code should be executed.

 **/