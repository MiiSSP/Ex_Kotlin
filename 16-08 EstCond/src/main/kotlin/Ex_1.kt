/*
Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
fun main()
{
    print("Insira o primeiro número aqui: ")
    val a = readln().toInt()

    print("Insira o segundo número aqui: ")
    val b = readln().toInt()

    print("Insira o terceiro número aqui: ")
    val c = readln().toInt()

    if (a>b && a>c)
    {
        println ("\nO maior número informado foi: $a")
    }
    else if (b>a && b>c)
    {
        println ("\nO maior número informado foi: $b")
    }
    else
    {
        println ("\nO maior número informado foi: $c")
    }

}