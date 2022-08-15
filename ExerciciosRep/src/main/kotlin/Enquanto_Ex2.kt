import java.util.Scanner

/*
Obtenha um número digitado pelo usuário e repita a operação
de multiplicar ele por três  (imprimindo o novo valor) até
que ele seja maior do que 100. Ex.: se o usuário digita 5,
deveremos observar na tela a seguinte sequência: 5 15 45 135.
 */

fun main ()
{
    val n = Scanner(System.`in`)

    println ("Bem Vinde!")

    print ("Escreva aqui o número a ser multiplicado por 3: ")
    val num = n.nextInt ()

    var mult = (num * 3)
    println (mult)

    while (mult < 100)
    {
        mult = (mult * 3)
        println (mult)

    }
}
