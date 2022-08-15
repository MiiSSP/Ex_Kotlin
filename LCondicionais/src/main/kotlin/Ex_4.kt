/*
Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */

fun main()
{
    print("Insira seu número aqui: ")
    val n = readln().toInt()

    if (n % 2 == 0 && n >= 0)
    {
       println ("O número inserido é par e positivo")
    }

    if (n % 2 == 1)
    {
        println ("O número inserido é impar e positivo")
    }

    if (n % 2 == 0 && n < 0)
    {
        println ("O número inserido é par e negativo")
    }

    if  (n % 2 != 0 && n < 0)
    {
       println ("O número inserido é impar e negativo")
    }
}
