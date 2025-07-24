package org.example.sprint_2

fun main() {
    val abilityBuff = 0.2
    val nCrystalOreWithoutBuff = 7
    val nIronOreWithoutBuff = 11

    val nCrystalOreWithBuff = (nCrystalOreWithoutBuff*abilityBuff).toInt()
    val nIronOreWithBuff = (nIronOreWithoutBuff*abilityBuff).toInt()

    println("Дополнительная кристалическая руда: $nCrystalOreWithBuff")
    println("Дополнительная железная руда: $nIronOreWithBuff")
}