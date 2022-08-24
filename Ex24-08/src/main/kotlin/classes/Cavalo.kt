package classes

class Cavalo (nome: String, idade: Int, som: String):Animal(nome, idade, som)
{
    var correr = ""

    override fun nome()
    {
        print("Informe o nome do cavalo: ")
        nome = readln()
    }

    override fun idade() {
        print("Informe a idade que o cavalo tem: ")
        idade = readln().toInt()
    }

    override fun som() {
        print("Qual o nome do som que este cavalo emite: ")
        som = readln()
    }

    override fun movimento()
    {
        print("Qual a velocidade que este cavalo corre: ")
        correr = readln()
    }

    override fun toString(): String
    {
        println("---CAVALO---")
        println("Nome:$nome\n" +
                "Idade: $idade\n" +
                "Som emitido: $som\n" +
                "Velocidade de corrida: $correr\n")
        return super.toString()
    }
}