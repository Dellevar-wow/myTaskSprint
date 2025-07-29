package org.example.sprint_3

fun main() {
    val move = "D2-D4;0"

    val whereFrom = move.split("[-;]".toRegex())[0]
    var where = move.split("[-;]".toRegex())[1]
    var moveNumber = move.split("[-;]".toRegex())[2]

    println("Откуда: $whereFrom")
    println("Куда: $where")
    println("Номер хода: $moveNumber")
}