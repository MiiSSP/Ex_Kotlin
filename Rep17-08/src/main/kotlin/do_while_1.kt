/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
 */

fun main ()
{
    var soma = 0

    println("Ola!!")

    do
    {
        print("Digite seu número: ")
        val n = readln().toInt()

        soma += n
    }
        while (n != 0)

    println("\nA soma dos números informados é $soma")
}