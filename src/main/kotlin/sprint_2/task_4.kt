package org.example.sprint_2

fun main() {
    val abilityBuff = 20
    val nCrystalOreWithoutBuff = 7
    val nIronOreWithoutBuff = 11

    val nCrystalOreWithBuff = (nCrystalOreWithoutBuff * abilityBuff/100).toInt()
    val nIronOreWithBuff = (nIronOreWithoutBuff * abilityBuff/100).toInt()

    println("Дополнительная кристалическая руда: $nCrystalOreWithBuff")
    println("Дополнительная железная руда: $nIronOreWithBuff")
}