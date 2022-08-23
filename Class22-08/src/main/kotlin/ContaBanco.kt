fun main ()
{
    val conta = ContaB (titular = "", conta = "", agencia = "")

    while (true)
    {
        println("\nBem vindo(a) ao menu principal, qual ação gostaria de realizar:")

        println("\n1 - Inserir dados do titular")
        println("2 - Realizar saque")
        println("3 - Realizar deposito")
        println("4 - Verificar saldo")
        println("5 - Sair do sistema")

        print("\nInsira o número correspondente a opção escolhida: ")
        when (readln().toInt()) {
            1 -> {conta.criarConta()}
            2 -> {conta.saque()}
            3 -> {conta.deposito()}
            4 -> {conta.saldo()}
            5 -> {print("Obrigado!!"); break}
            else -> println("Opção Invalida")
        }
    }
}