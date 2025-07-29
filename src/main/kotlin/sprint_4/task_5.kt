package org.example.sprint_4

fun main() {
    print("Есть ли повреждения корпуса? (true/false): ")
    val hasDamage = readLine()?.toBoolean() ?: false

    print("Введите количество членов экипажа: ")
    val crew = readLine()?.toIntOrNull() ?: 0

    print("Введите количество ящиков с провизией: ")
    val supply = readLine()?.toIntOrNull() ?: 0

    print("Погода благоприятная? (true/false): ")
    val goodWeather = readLine()?.toBoolean() ?: false

    val canSail =
        (!hasDamage && crew in 55..70 && supply > 50 && (goodWeather || !goodWeather)) ||
                (hasDamage && crew == 70 && goodWeather && supply >= 50)

    if (canSail) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отплыть.")
    }
}
