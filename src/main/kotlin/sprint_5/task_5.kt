package org.example.sprint_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }.distinct().toMutableList()
    while (winningNumbers.size < 3) {
        val newNumber = Random.nextInt(0, 43)
        if (newNumber !in winningNumbers) {
            winningNumbers.add(newNumber)
        }
    }

    println("Добро пожаловать в суперлотерею!")
    println("Введите три числа от 0 до 42 (по одному за раз):")

    val userNumbers = mutableListOf<Int>()

    var count = 0

    while (count < 3) {
        print("Число ${count + 1}: ")
        val input = readLine()?.toIntOrNull()

        if (input != null && input in 0..42) {
            userNumbers.add(input)
            count++
        } else {
            println("Неверный ввод. Пожалуйста, введите число от 0 до 42.")
        }
    }

    // Находим совпадения
    val matchedNumbers = userNumbers.intersect(winningNumbers.toSet())
    val matches = matchedNumbers.size

    // Вывод результата
    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!")
        2 -> println("Отлично! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число. Вам полагается утешительный приз.")
        0 -> println("Увы, вы не угадали ни одного числа.")
    }

    // Показываем выигрышные числа
    println("Выигрышные числа: ${winningNumbers.joinToString(", ")}")
}
