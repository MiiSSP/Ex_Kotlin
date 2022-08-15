/*
Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */

fun main()
{
    println ("Olá!! Vamos calcular a area do seu triangulo")
    println ("\nInforme os seguintes dados")

    print ("Valor da base do triangulo: ")
    val b = readln().toDouble()

    print ("Valor da altura do triangulo: ")
    val h = readln().toDouble()

    if (h <= 0 || b <=0)
    {
        println ("O valor informado esta invalido")
        println ("ATENÇÃO os valores inseridos devem ser positivos e maiores que zero")
    }

    else
    {
        println ("\nA area do seu triangulo é ${(h * b)/2}")
    }
}