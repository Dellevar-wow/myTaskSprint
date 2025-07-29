package org.example.sprint_4

fun main() {
    val tableCount = 13
    val reserveToday = 13
    val reserveTomorrow = 9

    println("Доступность столиков на сегодня: ${tableCount != reserveToday}")
    println("Доступность столиков на сегодня: ${tableCount != reserveTomorrow}")
}