import kotlin.math.pow
import kotlin.math.sqrt

/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

fun main()
{
    println ("Bem vinde!!")
    print ("Insira seu número aqui: ")
    val n = readln().toInt()

    if (n % 2 == 0)
    {
        println ("O número informado é par")
        println ("A raiz quadrada de $n é ${"%.2f".format(sqrt(n.toDouble()))}")
    }
    else
    {
        println ("O número informado é impar")
        println ("O número $n elevado ao quadrado, é igual a ${n.toDouble().pow(2.0)}")
    }

}