import java.util.Scanner

/*
Obtenha um número digitado pelo usuário e repita a operação
de multiplicar ele por três  (imprimindo o novo valor) até
que ele seja maior do que 100. Ex.: se o usuário digita 5,
deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

fun main ()
{
    val N = Scanner(System.`in`)

    println ("Bem Vinde!")

    print ("Escreva aqui o número a ser multiplicado por 3: ")
    val Num = N.nextInt ()

    var Mult = (Num * 3)
    println (Mult)

    while (Mult < 100)
    {
        Mult = (Mult * 3)
        println (Mult)

    }
}
