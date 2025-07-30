package org.example.sprint_3

fun main() {
    val move = "D2-D4;0"

    val (whereFrom, where, moveNumber) = move.split("-", ";")

    println("Откуда: $whereFrom")
    println("Куда: $where")
    println("Номер хода: $moveNumber")
}