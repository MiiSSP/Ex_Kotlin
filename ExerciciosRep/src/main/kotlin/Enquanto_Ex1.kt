/*
Elaborar um programa que efetue a leitura sucessiva de valores
numéricos e apresente no final o total do somatório, a média e
o total de valores lidos. O programa deve fazer as leituras dos
valores enquanto o usuário estiver fornecendo valores positivos.
Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

import java.util.Scanner

fun main()
{
    val N = Scanner(System.`in`)
    var Soma = 0.0
    var Contador = 0
    var Num = 0.0

    println("Bem Vindo")
    println()

    while (Num >= 0)
    {
        Soma += Num
        Contador ++
        print("Escreva aqui seu número: ")
        Num = N.nextDouble()
    }
         if (Num < 0)
         {
          Contador --
         }

    val Media = Soma / Contador
    println()
    println ("Estes são os valores")
    println ("Da soma dos números informados: $Soma")
    println ("Da média dos números informados: $Media")
    println ("Da quantidade total de números inseridos: $Contador")

}