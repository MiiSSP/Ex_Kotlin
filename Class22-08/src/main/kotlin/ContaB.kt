/*
Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
class ContaB(
    var titular: String,
    var conta: String,
    var agencia: String
)
{
    var saldoIn = 0.0
    var saque = 0.0
    var deposito = 0.0

    constructor (
        titular: String,
        tipoC: String,
        agencia: String,
        saldoIn: Double,
        saque: Double,
        deposito: Double
    ):  this(titular, tipoC, agencia){
        this.saldoIn = saldoIn
        this.saque = saque
        this.deposito = deposito
    }

    fun criarConta()
    {
        print("\nInsira o nome do titular da conta: ")
        titular = readln()

        print("Insira o numero da agencia: ")
        agencia = readln()

        print("Informe o numero da conta: ")
        conta = readln()

        print("Informe o saldo inicial desta conta: ")
        saldoIn = readln().toDouble()

        println("\nOlá $titular, você será redirecionado(a) para o menu principal...")


    }

    fun saldo ()
    {
        println("O saldo disponivel em sua conta é de: R$ $saldoIn")

        println("\nVocê será redirecionado(a) para o menu principal...")
    }

    fun deposito ()
    {
        print("Informe o valor desejado para deposito: ")
        deposito = readln().toDouble()

        if (deposito > 0.0) {
            saldoIn += deposito
            println("Deposito de R$ $deposito realizado com sucesso!")
        } else {
            println("Deposito de R$$deposito não pode ser realizado!")
            val resp = readln()
        }
        println("\nVocê será redirecionado(a) para o menu principal...")
    }

    fun saque () {
        print("Informe o valor desejado para saque: ")
        saque = readln().toDouble()

        if (saldoIn > 0.0 && saque <= saldoIn) {
            saldoIn -= saque
            println("Saque de R$ $saque realizado com sucesso!")
        } else {
            println("Saque de R$ $saque não pode ser realizado!")
        }
        println("\nVocê será redirecionado(a) para o menu principal...")
    }
}