package org.example.sprint_2

const val PERCENT = 100

fun main() {
    val abilityBuff = 20
    val nCrystalOreWithoutBuff = 7
    val nIronOreWithoutBuff = 11

    val nCrystalOreWithBuff = (nCrystalOreWithoutBuff * abilityBuff/PERCENT).toInt()
    val nIronOreWithBuff = (nIronOreWithoutBuff * abilityBuff/PERCENT).toInt()

    println("Дополнительная кристалическая руда: $nCrystalOreWithBuff")
    println("Дополнительная железная руда: $nIronOreWithBuff")
}