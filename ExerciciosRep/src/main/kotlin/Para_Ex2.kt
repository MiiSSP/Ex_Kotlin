/*
Desenvolver um sistema que efetue a soma de todos os números ímpares
que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */

fun main ()
{
    var soma = 0

    print ("Estes são alguns dos números impares, multiplos de")

    for (cont in 1 .. 500)
        {
            if (cont % 2 == 1 && cont % 3 == 0)
            {
                println (" $cont")
                soma = (soma + cont)
            }
        }
    println ("O resultado da soma destes números é: $soma")
}