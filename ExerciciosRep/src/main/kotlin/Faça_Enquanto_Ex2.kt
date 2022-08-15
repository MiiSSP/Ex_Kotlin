/*
Faça um programa que pegue um número do teclado e calcule a
soma de todos os números  de 1 até ele. Ex.: o usuário entra
7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/

import java.util.Scanner

fun main() {
    val n = Scanner(System.`in`)
    var soma = 0.0
    var contador = 0

    println("Bem Vinde!")

    print("Escreva aqui seu número: ")
    val num = n.nextDouble()

    do
    {
        soma += contador
        contador++
    }

    while(contador <= num)

    println("O valor do seu calculo é: $soma")


}