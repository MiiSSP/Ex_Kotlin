/*
Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
class Patinete
{
    var tamanho = ""
    var cor = ""
    var modelo = ""
    var data = ""

    fun cadastroP ()
    {
        print("Informe o tamanho do patinete: ")
        tamanho = readln()

        print("Informe a cor: ")
        cor = readln()

        print("Informe o modelo: ")
        modelo = readln()

        print("Informe a data de entrega do patinete para o funcionario: ")
        data = readln()

    }

    fun previewP ()
    {
        println("Tamanho: $tamanho")
        println("Modelo: $modelo ")
        println("Cor: $cor")
        println("Data de entrega: $data")
    }
}