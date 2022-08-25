class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String,
) {

    //AS FUNÇÕES ESTÃO COMENTADAS PARA QUE OS TESTES FUNCIONEM!!!
   private val _listComp = mutableListOf<String>()
    val listComp: List<String> = _listComp

   /*init
    {
    dadosCli()
    }

    */


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

    fun  addCompras (produto: String)
    {

       // while (true)
        //{
            print("\nInsira a descrição do produto a ser adicionado: ")
            //val  produto = readln()

            if (produto.isNotBlank())
            {
                _listComp.add (produto)
                println("Produto $produto adicionado com sucesso!")
                //break
            }
            else
            {
                println("Produto inválido!")
            }

        //}
    }

    fun  remCompras (produto: String)
    {
        while (true)
        {
            print("Insira o produto a ser removido: ")
            //val produto = readln()

            if (_listComp.contains(produto))
            {
                _listComp.remove (produto)
                println("Produto $produto removido com sucesso!")
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
        _listComp.forEach{
            println(it)
        }

    }
}