/*
Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
 */

fun main()
{
    for (n in 1000..1999)
    {
        if (n % 11 == 5)
        println ("$n")
    }
}