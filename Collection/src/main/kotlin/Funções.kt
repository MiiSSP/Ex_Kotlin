/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list
 */
val controlEst = mutableMapOf<Int, String>()

fun addPro ()
{
    do {
        println("\nInsira o código e a descrição do produto, nesta ordem: ")
        controlEst[readln().toInt()] = readln()

        println("\nProduto adicionado com sucesso!!")

        println("\nDeseja adicionar outro produto (s / n)? ")
        val resp = readln()

        if (resp == "n")
        {
            print("\nVocê será redirecionado para o menu principal!!")
            println()
        }
        else (println ("Opção Invalida"))

    } while (resp == "s")


}

fun remPro ()
{
    do
    {
        println ("Insira o código e a descrição do produto a ser removido: ")
        val cod = readln().toInt()
        val desc = readln()

        if (controlEst.containsKey(cod) && controlEst.containsValue(desc))
        {
            controlEst.remove(cod, desc)
            println("Produto removido com sucesso!!")

        }
        else (println("Produto inexistente!!"))

        println("\nDeseja remover outro produto (s / n)? ")
        val resp = readln()

            if (resp == "n")
            {
                print("\nVocê será redirecionado para o menu principal!!")
                println()
            }
            else (println ("Opção Invalida"))


    } while (resp == "s")
}

fun listPro ()
{
    println("Produtos cadastrados")
    controlEst.forEach { (cod, desc) ->
        println("Descrição: $desc, código: $cod") }

    print("\nPara retornar ao menu principal, digite 1: ")
    var resp = readln().toInt()

    while (resp != 1)
    {
        println ("Opção Invalida")

        print("\nPara retornar ao menu principal, digite 1: ")
        resp = readln().toInt()
    }
}

fun atPro ()
{
    println("Digite o código e a descrição do produto que deseja atualizar: ")
    var cod = readln().toInt()
    var desc = readln()

    if (controlEst.containsKey(cod) && controlEst.containsValue(desc))
    {
        println("Digite o novo nome do produto: ")

        controlEst[cod] = readln()

        println("Produto atualizado com sucesso!")
    }
    else (println ("O produto informado não existe"))
}
