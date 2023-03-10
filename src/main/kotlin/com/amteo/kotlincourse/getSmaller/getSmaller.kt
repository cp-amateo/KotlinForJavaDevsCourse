package com.amteo.kotlincourse.getSmaller

// Add your solution here

fun <T : Comparable<T>> getSmaller(param1: T, param2: T): T {
    val comparatorResult = param1.compareTo(param2)
    return if (comparatorResult <= 0) param1 else param2
}

fun main() {
    println("getSmaller")

    // Please add the getSmaller function above the main function
    val minInt: Int = getSmaller(42, 99)
    val minDouble: Double = getSmaller(9.807, 3.14159)
    val minString: String = getSmaller("kitten", "kittens")

    println("The min Int = $minInt")
    println("The min Double = $minDouble")
    println("The min String = $minString")
}
