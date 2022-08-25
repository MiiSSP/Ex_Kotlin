/*
Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
 */

fun main ()
{
    val cliente = Cliente(nome = "", endereco = "", telefone = "")

    try
    {
    while (true) {
        println("\n....................MENU....................")

        println("\n1 - Inserir um novo produto a lista de compras")
        println("2 - Remover um produto da lista de compras")
        println("3 - Apresentar lista de produtos ja registrados")
        println("4 - Sair do sistema")

        print("\nInsira o número correspondente a opção escolhida: ")

        when (readln().toInt()) {
            1 -> cliente.addCompras("")
            2 -> cliente.remCompras("")
            3 -> cliente.exibirCompras()
            4 -> break
            else -> println("Opção Invalida")
        }

    }
    } catch (e: Exception){
        println(e.message)
    }
}