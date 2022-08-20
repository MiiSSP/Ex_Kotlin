
fun main ()
{
    while (true)
    {
        println ("\nBem vindo ao menu principal, qual ação gostaria de realizar:")

        println ("\n1 - Inserir um novo produto ao estoque")
        println ("2 - Remover um produto do estoque")
        println ("3 - Atualizar informações de um produto existente")
        println ("4 - Apresentar lista de produtos ja registrados")
        println ("5 - Sair do sistema")

        print ("\nInsira o número correspondente a opção escolhida: ")

        when (readln().toInt())
        {
            1 -> {addPro()}
            2 -> {remPro()}
            3 -> {}
            4 -> {listPro()}
            5 -> {break}
            else -> println ("Opção Invalida")
    }

    }










}