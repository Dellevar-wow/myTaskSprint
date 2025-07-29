package org.example.sprint_5

fun main() {
    println("Сколько будет 2+3?")
    val answer = readLine()?.toInt()

    if(answer == 5){
        println("Добро пожаловать!")
    } else{
        println("Доступ завпрещен.")
    }
}