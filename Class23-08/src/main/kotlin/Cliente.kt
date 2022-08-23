class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String,
) {

   private val listComp = mutableListOf<String>()

    init
    {
    dadosCli()
    }

    fun dadosCli()
    {
            print("Insira o nome do cliente: ")
            nome = readln()

            print("Insira o endereço deste cliente: ")
            endereco = readln()

            print("Insira o telefone deste cliente: ")
            telefone = readln()

            if (nome == "") {
                throw Exception("\nCadastro feito INCORRETAMENTE!!")
            }
    }

    fun  addCompras()
    {

        while (true)
        {
            print("\nInsira a descrição do produto a ser adicionado: ")
            val produto = readln()

            if (produto != "")
            {
                listComp.add (produto)
                println("Produto $produto adicionado com secesso!")
                break
            }
            else
            {
                println("Produto inválido!")
            }

        }
    }

    fun  remCompras()
    {
        while (true)
        {
            print("Insira o produto a ser removido: ")
            val produto = readln()

            if (listComp.contains(produto))
            {
                listComp.remove (produto)
                println("Produto $produto removido com secesso!")
                break
            }
            else
            {
                println("Produto inexistente!")
            }
        }
    }

    fun  exibirCompras()
    {
        println(".........LISTA DE COMPRAS.......")
        listComp.forEach{
            println(it)
        }

    }
}