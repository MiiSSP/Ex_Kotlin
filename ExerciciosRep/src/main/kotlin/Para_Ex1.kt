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
    val n = Scanner(System.`in`)
    var s100 = 0
    var soma = 0.0
    var maS = 0.0
    var mf = 0.0

    for (h in 1..20)
    {
        println ("$h º habitante")

        print ("Informe o salario: ")
        val s = n.nextDouble()

        print ("Quantidade de filhos que este possui: ")
        val f = n.nextDouble()

        soma = (soma + s)
        mf += f

        if (s <= 100)
         {
            s100 ++
         }

        if (s > maS)
        {
            maS = s
        }
}
        val meS = (soma / 20)
        mf = (mf / 20)
        val p = (s100 / 20.0) * 100

        println ()
        println ("A média do salario da população é de: R$ $meS")
        println ("A média de filhos é de: $mf")
        println ("O maior salario da população é de: R$ $maS")
        println ("O percentual de habitantes com salario de até R$: 100,00 é de: $p %")
}