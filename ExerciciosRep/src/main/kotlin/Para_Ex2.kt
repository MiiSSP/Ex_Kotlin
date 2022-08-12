/*
Desenvolver um sistema que efetue a soma de todos os números ímpares
que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */

fun main ()
{
    var Soma = 0

    print ("Estes são alguns dos números impares, multiplos de")

    for (Cont in 1 .. 500)
        {
            if (Cont % 2 == 1 && Cont % 3 == 0)
            {
                println (" $Cont")
                Soma = (Soma + Cont)
            }
        }
    println ("O resultado da soma destes números é: $Soma")
}