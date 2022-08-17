/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */

fun main ()
{
    var p = 0
    var i = 0

    println("Bem vinde!!")

    for (c in 1..10)
    {
        print("Insira o $c º número: ")
        val n = readln().toInt()

        if (n % 2 == 0)
        {
            p ++
        }
        else if (n % 2 == 1)
        {
            i ++
        }
    }
        println("\nVocê inseriu $p números pares e $i números impares ")
}
