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
    val n = Scanner(System.`in`)
    var soma = 0.0
    var contador = 0
    var num = 0.0

    println("Bem Vindo")
    println()

    while (num >= 0)
    {
        soma += num
        contador ++
        print("Escreva aqui seu número: ")
        num = n.nextDouble()
    }
         if (num < 0)
         {
          contador --
         }

    val media = soma / contador
    println()
    println ("Estes são os valores")
    println ("Da soma dos números informados: $soma")
    println ("Da média dos números informados: $media")
    println ("Da quantidade total de números inseridos: $contador")

}