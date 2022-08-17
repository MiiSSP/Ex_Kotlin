/*
Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */

fun main ()
{
    var cont = 1
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    var e = 0
    var f = 0

    println("Olá, preencha as informações solicitadas abaixo")

    while (cont <= 5) {
        print("\nInforme sua idade: ")
       val idade = readln().toInt()

        println("\nCom qual gênero você se identifica (1 - feminino / 2 - masculino / 3 - outros)")
        print("Insira o número correspondente ao seu gênero: ")
        val gen = readln().toInt()

        println("\nVocê se considera uma pessoa (1 - Calma / 2 - Nervosa / 3 - Agressiva)")
        print("Insira o número correspondente a sua personalidade: ")
        val per = readln().toInt()

        cont ++

        if (per == 1)
        {
            a++
        }
        if (gen == 1 && per == 2)
        {
            b++
        }
        if (gen == 2 && per == 3)
        {
            c++
        }
        if (gen == 3 && per == 1)
        {
            d++
        }
        if (idade > 40 && per == 2)
        {
            e++
        }
        if (idade < 18 && per == 1)
        {
            f++
        }
    }

    println ("\nA partir dos dados obtidos com a pesquisa, tem-se:")
    println ("O número de pessoas calmas é $a")
    println ("O número de mulheres nervosas é $b")
    println ("O número de homens agressivos é $c")
    println ("O número de outros calmos é $d")
    println ("O número de pessoas nervosas com mais de 40 anos é $e")
    println ("O número de pessoas calmas com menos de 18 anos é $f")

}