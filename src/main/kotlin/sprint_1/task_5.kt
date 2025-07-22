package org.example.sprint_1

import kotlin.math.round

fun main() {
    var seconds = 6480
    val hours= seconds/3600
    val minutes = seconds % 3600 /60
    seconds = seconds % 3600 % 60
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}