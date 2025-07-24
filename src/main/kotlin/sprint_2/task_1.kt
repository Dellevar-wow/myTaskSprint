package org.example.sprint_2

fun main() {
    val marksEnglish = listOf(3,4,3,5)
    val numberOfHuman = marksEnglish.count()

    val averrageMarke = marksEnglish.sum().toDouble() / numberOfHuman

    print(averrageMarke)
}