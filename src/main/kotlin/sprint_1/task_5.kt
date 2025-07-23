package org.example.sprint_1

import kotlin.math.pow

const val SECONDS_IN_MINUTES = 60.0
fun main() {
    var seconds = 6480
    val hours = seconds / SECONDS_IN_MINUTES.pow(2).toInt()
    val minutes = seconds % SECONDS_IN_MINUTES.pow(2).toInt() / SECONDS_IN_MINUTES.toInt()
    seconds = seconds % SECONDS_IN_MINUTES.pow(2).toInt() % SECONDS_IN_MINUTES.toInt()
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}