/*
Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */

fun main()
{
    println ("Encontrando o quadrado do seu número")
    println ("Insira quatro números nos espaços abaixo:")

    print ("\nPrimeiro número: ")
    var n1 = readln().toDouble()

    print ("Segundo número: ")
    var n2 = readln().toDouble()

    print ("Terceiro número: ")
    var n3 = readln().toDouble()

    print ("Quarto número: ")
    var n4 = readln().toDouble()

    n1 = (n1 * n1)
    n2 = (n2 * n2)
    n3 = (n3 * n3)
    n4 = (n4 * n4)

    if (n3 >= 1000)
    {
        println ("\nO seu terceiro número elevado ao quadrado é: $n3")
    }

    else
    {
        println ("\nEstes são seus números elevados ao quadrado:")
        println ("Primeiro número: $n1")
        println ("Segundo número: $n2")
        println ("Terceiro número: $n3")
        println ("Quarto número: $n4")

    }
}