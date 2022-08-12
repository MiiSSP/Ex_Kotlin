import java.util.*

/*
A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
 */

fun main ()
{
    val N1 = Scanner(System.`in`)
    val N2 = Scanner(System.`in`)
    var S100 = 0
    var Soma = 0.0
    var MeS = 0.0
    var MaS = 0.0
    var MF = 0.0
    var P = 0.0
    var S = 0.0
    var F = 0.0

    for (H in 1..20)
    {
        println ("$H º habitante")

        print ("Informe o salario: ")
        S = N1.nextDouble()

        print ("Quantidade de filhos que este possui: ")
        F = N2.nextDouble()

        Soma = (Soma + S)
        MF += F

        if (S <= 100)
         {
            S100 ++
         }

        if (S > MaS)
        {
            MaS = S
        }
}
        MeS = (Soma / 20)
        MF = (MF / 20)
        P = (S100 / 20.0) * 100

        println ()
        println ("A média do salario da população é de: R$ $MeS")
        println ("A média de filhos é de: $MF")
        println ("O maior salario da população é de: R$ $MaS")
        println ("O percentual de habitantes com salario de até R$: 100,00 é de: $P %")
}