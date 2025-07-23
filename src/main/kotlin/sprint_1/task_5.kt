package org.example.sprint_1

const val SECONDS_IN_MINUTES = 60
const val SECONDS_IN_HOURS = SECONDS_IN_MINUTES*SECONDS_IN_MINUTES

fun main() {
    var seconds = 6480
    val hours = seconds / SECONDS_IN_HOURS
    val minutes = seconds % SECONDS_IN_HOURS / SECONDS_IN_MINUTES
    seconds = seconds % SECONDS_IN_HOURS % SECONDS_IN_MINUTES

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}