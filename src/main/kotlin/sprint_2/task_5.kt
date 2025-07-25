package org.example.sprint_2

import kotlin.math.pow

fun main() {
    val nMoney = 70000
    val interestRate = 16.7/100
    val term = 20

    val depositThrowTerm = nMoney * (1 + interestRate).pow(term)

    println("%.3f".format(depositThrowTerm))
}