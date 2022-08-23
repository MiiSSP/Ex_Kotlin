/*
Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
class Paciente(
    var nome: String,
    var idade: Int,
    var cpf: String,
    var rg: String,
    var sintomas: String
)
{
    var alergia = ""
    var medicamentos = ""
    var atestado = ""
    var declaracao = ""

    constructor (
        nome: String,
        idade: Int,
        cpf: String,
        rg: String,
        sintomas: String,
        alergia: String,
        medicamentos: String,
        atestado: String,
        declaracao: String
            ):  this(nome, idade, cpf, rg, sintomas){
                this.alergia = alergia
                this.medicamentos = medicamentos
                this.atestado = atestado
                this.declaracao = declaracao
            }


    fun ficha()
    {
        print("Insira o nome do paciente: ")
        nome = readln()

        print("Insira a idade deste paciente: ")
        idade = readln().toInt()

        print("Insira o RG do paciente: ")
        rg = readln()

        print("Insira o CPF do paciente: ")
        cpf = readln()

        print("Informe os sintomas apresentados: ")
        sintomas = readln()

        println("O paciente possui alguma alergia a medicamentos (s/n) ")
        val resp = readln()

        if (resp == "s")
        {
            print("Informe quais alergias o paciente possui: ")
            alergia = readln()
        }
        else {alergia = "Paciente não possui alergia a medicamentos!!"}

        println("Algum medicamento foi receitado ao paciente (s/n) ")
        val resp1 = readln()

        if (resp1 == "s")
        {
            print("Insira os medicamentos receitados ao paciente: ")
            medicamentos = readln()
        }
        else {alergia = "Nenhum medicamento foi receitado ao paciente"}

        print("O paciente recebeu atestado (s/n): ")
        val resp2 = readln()

        if (resp2 == "s")
        {
            print("Quantos dias de atestado o paciente recebeu: ")
            atestado = readln()
        }
        else
        {
            atestado = "O paciente não recebeu atestado"
        }

        println("O paciente recebeu declaração de horas (s/n): ")
        val resp3 = readln()

        if (resp3 == "s")
        {
            print("O paciente recebeu uma declaração de quantas horas: ")
            declaracao = readln()
        }
        else
        {
            declaracao = "O paciente não recebeu declarações!!"
        }

        println("\nFicha preenchida com sucesso!!")
    }

    fun previewFicha() {
        println("Nome paciente: $nome")
        println("Idade: $idade anos")
        println("CPF: $cpf ")
        println("RG: $rg ")
        println("Sintomas: $sintomas")
        println("Alergia a medicamentos: $alergia ")
        println("Medicamento receitados: $medicamentos ")
        println("Dias de atestado: $atestado ")
        println("Declaração de horas: $declaracao ")
    }
}