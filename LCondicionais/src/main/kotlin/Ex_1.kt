/*
João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
 */

fun main()
{
    print ("Insira o peso dos tomates em Kg: ")
    val peso = readln().toDouble()

    if (peso > 50.0)
    {
        val e = (peso - 50.0)

        println ("Peso acima do máximo permitido !! ")
        println ("Você terá que pagar uma multa no valor de R$  ${e * 4.0}")
    }

   else
    {
        println ("Peso dentro do permitido")
        println ("Muito obrigado !")
    }
}
