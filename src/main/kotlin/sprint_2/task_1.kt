package org.example.sprint_2

fun main() {
    val marksEnglish = listOf(3,4,3,5)

    val averageMark = marksEnglish.sum().toDouble() / marksEnglish.count()

    print(averageMark)
}