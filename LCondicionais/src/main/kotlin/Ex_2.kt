/*
Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */

fun main()
{
    println("Olá, você esta na seção de preenchimento de dados")
    println("Insira os dados do(a) funcionario(a) abaixo:")

    print("\nNome: ")
    val nome = readln()

    print("Código: ")
    val cod = readln().toInt()

    print("Horas trabalhadas: ")
    val horas = readln().toDouble()

    println ("\nVerificação de Dados")
    println ("Funcionario(a): $nome")
    println ("Código: $cod")
    println ("Horas trabalhadas: $horas")

    if (horas <= 50)
    {
        val s = (horas * 10)
        println ("\nRealizar pagamento de salario no valor de: R$ $s")
        println ("Este(a) funcionario(a) não possui horas extras")
    }

    else
    {
        val e = ((horas - 50)*20)
        println ("\nRealizar pagamento de salario no valor de: R$ ${50 * 10}")
        println ("Realizar pagamento de horas extras no valor de: $e")
    }
}