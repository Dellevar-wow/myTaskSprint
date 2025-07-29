package org.example.sprint_4

fun main() {
    val weightOfCargo1 = 20
    val cargoVolume1 = 80

    val weightOfCargo2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $weightOfCargo1 кг и объемом $cargoVolume1" +
            " л соответствует категории 'Average': " +
            "${weightOfCargo1 > 35 && weightOfCargo1<= 100 && cargoVolume1 < 100}")
    println("Груз с весом $weightOfCargo2 кг и объемом $cargoVolume2" +
            " л соответствует категории 'Average': " +
            "${weightOfCargo2 > 35 && weightOfCargo2<= 100 && cargoVolume2 < 100}")
}