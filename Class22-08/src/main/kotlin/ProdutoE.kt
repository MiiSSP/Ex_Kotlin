/*
Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */
class ProdutoE
{
    var desc = ""
    var valor = 0.0
    var tamEm = ""
    var cliente = ""
    var dataEnt = ""
    var endereco = ""

    fun cadPro ()
    {
        print("Insira a descrição do produto: ")
        desc = readln()

        print("Insira seu valor: ")
        valor = readln().toDouble()

        print("Informe o tamanho da embalagem: ")
        tamEm = readln()

        print("Informe o endereço de entrega: ")
        endereco = readln()

        print("Insira o nome do cliente: ")
        cliente = readln()

        print("Insira a data de envio: ")
        dataEnt = readln()

    }

    fun previewPro ()
    {
        println("Descrição: $desc")
        println("Valor: R$ $valor ")
        println("Tamanho da embalagem: $tamEm")
        println("Nome do cliente: $cliente ")
        println("Endereço de entrega: $endereco ")
        println("Data de envio: $dataEnt ")
    }
}