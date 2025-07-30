package org.example.sprint_5

fun main() {
    val numWinner1 = 4
    val numWinner2 = 27
    println("Введите 1-е число от 0 до 42: ")
    val numUser1 = readln().toInt()
    println("Введите 2-е число от 0 до 42: ")
    val numUser2 = readln().toInt()

    if((numWinner1 == numUser1 || numWinner1 == numUser2) && (numWinner2 == numUser1 || numWinner2 == numUser2)){
        println("“Поздравляем! Вы выиграли главный приз!")
    } else if(numWinner1 == numUser1 || numWinner1 == numUser2 || numWinner2 == numUser1 || numWinner2 == numUser2){
        println("Вы выиграли утешительный приз!")
    } else{
        println("Неудача!")
    }
}
