/*
Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.
 */

fun main()
{
    print ("Oii, insira a variavel númerica a ser analisada: ")
    val n = readln().toDouble()

    if (n > 100)
    {
        print ("\nSua variavel númerica equivale á: $n")
        print ("\nObrigado")
    }

    else
    {
        println ("Sua variavel númerica equivale á: 0")
        println ("\nLEMBRE-SE: Este sistema só reconhece valores acima de cem!!")
        println ("Obrigado")
    }
}