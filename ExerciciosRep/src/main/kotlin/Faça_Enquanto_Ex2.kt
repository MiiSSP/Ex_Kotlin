/*
Faça um programa que pegue um número do teclado e calcule a
soma de todos os números  de 1 até ele. Ex.: o usuário entra
7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/

import java.util.Scanner

fun main() {
    val N = Scanner(System.`in`)
    var Soma = 0.0
    var Contador = 0

    println("Bem Vinde!")

    print("Escreva aqui seu número: ")
    val Num = N.nextDouble()

    do
    {
        Soma += Contador
        Contador++
    }

    while(Contador <= Num)

    println("O valor do seu calculo é: $Soma")


}