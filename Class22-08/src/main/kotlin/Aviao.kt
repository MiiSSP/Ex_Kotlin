/*
Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
class Aviao
    (
    var companhia: String,
    var qPassagens: Int,
    var classe: String,
    var horario: String,
    var destino: String
) {

    var passV = ""

    constructor (
        companhia: String,
        qPassagens: Int,
        classe: String,
        horario: String,
        destino: String,
        passV: String
    ) : this(companhia, qPassagens, classe, horario, destino)
    {
        this.passV = passV
    }

    fun cadViagem()
    {
        print("Informe o destino da viagem: ")
        destino = readln()

        print("Insira a companhia aerea: ")
        companhia = readln()

        print("Insira a quantidade de passagens: ")
        qPassagens = readln().toInt()

        print("Informe o tipo de classe: ")
        classe = readln()

        print("Insira o horário de embarque: ")
        horario = readln()

        print("O cliente comprou passagem de volta: ")
        val resp = readln()

        if (resp == "s")
        {
            println("Insira o horario de embarque para seu retorno: ")
            passV = readln()
        }
        else {passV = "Passagem não comprada"}

        println("\nCadastro feito com sucesso!!")
    }

    fun previewV ()
    {
        println("Destino da viagem: $destino ")
        println("Companhia aerea: $companhia")
        println("Quantidade de passagens: $qPassagens ")
        println("Classe: $classe ")
        println("Embarque (ida): $horario ")
        println("Embarque (retorno): $passV ")
    }
}