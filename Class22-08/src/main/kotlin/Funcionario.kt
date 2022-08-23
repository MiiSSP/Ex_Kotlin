/*
Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.
 */
class Funcionario
{
    var nome = ""
    var idade = 0
    var sexo = ""
    var cpf = ""
    var rg = ""
    var cargo = ""

    fun cadastroF ()
    {
        print("Insira o nome do funcionario: ")
        nome = readln()

        print("Insira a idade: ")
        idade = readln().toInt()

        print("Informe o genêro: ")
        sexo = readln()

        print("Informe o cargo: ")
        cargo = readln()

        print("Insira o CPF: ")
        cpf = readln()

        print("Insira o RG : ")
        rg = readln()

    }

    fun previewF ()
    {
        println("Funcionario: $nome")
        println("Idade: $idade ")
        println("Gênero: $sexo")
        println("Cargo: $cargo ")
        println("CPF: $cpf ")
        println("RG: $rg ")
    }
}