/*
Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

class Cliente
{
    var nome = ""
    var idade = 0
    var sexo = ""
    var cpf = ""
    var rg = ""
    var nacionalidade = ""

    fun cadastro ()
    {
        print("Insira o nome do cliente: ")
        nome = readln()

        print("Insira a idade deste cliente: ")
        idade = readln().toInt()

        print("Informe o genêro deste cliente: ")
        sexo = readln()

        print("Insira o CPF deste cliente: ")
        cpf = readln()

        print("Insira o RG deste cliente: ")
        rg = readln()

        print("Informe a nacionalidade deste cliente: ")
        nacionalidade = readln()
    }

    fun previewC ()
    {
        println("Cliente: $nome")
        println("Idade: $idade ")
        println("Gênero: $sexo")
        println("Nacionalidade: $nacionalidade ")
        println("CPF: $cpf ")
        println("RG: $rg ")
    }
}