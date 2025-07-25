package org.example.sprint_2

fun main() {
    val numberOfEmployee = 50
    val salaryOfEmployee = 30000
    val numberOfIntern = 30
    val salaryOfIntern = 20000

    val salaryForAllEmployee = numberOfEmployee * salaryOfEmployee
    val salaryForAllEmployeeAndIntern = salaryForAllEmployee + numberOfIntern * salaryOfIntern
    val averageSalaryOneEmployee = salaryForAllEmployeeAndIntern / (numberOfEmployee + numberOfIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryForAllEmployee")
    println("Общие расходы по ЗП после прихода стажеров: $salaryForAllEmployeeAndIntern")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryOneEmployee")
}