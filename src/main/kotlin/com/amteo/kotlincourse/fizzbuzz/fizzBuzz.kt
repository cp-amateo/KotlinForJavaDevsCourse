package com.amteo.kotlincourse.fizzbuzz

fun main() {
    println("Fizz Buzz")

    // Create a loop to display the numbers 1 to 105
    // after the number
    //  print "fizz" if the number is divisible by 3
    //  print "buzz" if the number is divisible by 5
    //  print "fizz buzz" if the number is divisible by 3 and 5

    // Add your solution here
    fizzBuzz()
}

fun fizzBuzz(maxNumber: Int = 105) {
    for (number in 1..maxNumber) {
        print("$number ")
        when {
            number % 3 == 0 && number % 5 == 0 -> print("fizz buzz")
            number % 3 == 0 -> print("fizz")
            number % 5 == 0 -> print("buzz")
        }
        println()
    }
}
