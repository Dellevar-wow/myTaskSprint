package org.example.sprint_5

const val MAJORITY = 18

fun main() {
    println("Введите ваш год рождения: ")
    val yearBirthday = readln().toInt()
    val currentYear = 2025


    if (currentYear - yearBirthday >= MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}