/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

fun main()
{
    print ("Olá!! Insira sua idade aqui: ")

    when (readln().toInt())
    {
        in 10 .. 14 -> println ("Você pertence a categoria infantil")
        in 15 .. 17 -> println ("Você pertence a categoria juvenil")
        in 18 .. 25 -> println ("Você pertence a categoria dos adultos")
        else -> println("A idade informada não é valida")
    }
}