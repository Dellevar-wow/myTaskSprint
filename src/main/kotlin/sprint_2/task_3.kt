package org.example.sprint_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hoursToStart: Int = 9
    val minutesToStart: Int = 39
    val minutesOnTheWayTotal: Int = 457

    val hoursOnTheWay: Int = minutesOnTheWayTotal / MINUTES_IN_HOUR
    val minutesOnTheWay: Int = minutesOnTheWayTotal - (hoursOnTheWay * MINUTES_IN_HOUR)

    println("Время прибытия поезда: $hoursOnTheWay:$minutesOnTheWay")
}