package org.example.sprint_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var moveNumber = 1

    println("Ход: [$whereFrom-$where; $moveNumber]")

    whereFrom = "D2"
    where = "D3"
    moveNumber += 1
    println("Ход: [$whereFrom-$where; $moveNumber]")

}