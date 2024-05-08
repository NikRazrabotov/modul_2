package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val goodMetallPrice = 120
    val badMetallPrice = 50
    val checkPrice = 300
    print("Введите кол-во хорошего метала")
    val godMetall = readLine()
    print("Введите кол-во Плохого метала")
    val badMetall = readLine()
//    println(godMetall * goodMetallPrice + badMetall * badMetallPrice - 300)
    val day1Earnings = 6 * goodMetallPrice + 8 * badMetallPrice - 300
    println (day1Earnings)
    }
