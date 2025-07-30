package org.example.sprint_4

const val AIRHUMIDITYVALUE = 20
const val CURRENTSEASONSTOP = "зима"

fun main() {
    val weatherToday: Boolean = true
    val awningIsCurrently: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                "${
                    weatherToday && awningIsCurrently && airHumidity == AIRHUMIDITYVALUE && currentSeason != CURRENTSEASONSTOP
                }"
    )
}