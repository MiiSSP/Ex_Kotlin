package classes

class Cachorro (nome: String, idade: Int, som: String):Animal(nome, idade, som)

{
    var correr = ""

    override fun nome()
    {
        print("Informe o nome do cachorro: ")
        nome = readln()
    }

    override fun idade() {
        print("Informe a idade que o cachorro tem: ")
        idade = readln().toInt()
    }

    override fun som() {
        print("Qual o nome do som que este cachorro emite: ")
        som = readln()
    }

    override fun movimento()
    {
        print("Qual a velocidade que este cachorro corre: ")
        correr = readln()
    }

    override fun toString(): String
    {
        println("---CACHORRO---")
        println("Nome:$nome\n" +
                "Idade: $idade\n" +
                "Som emitido: $som\n" +
                "Velocidade de corrida: $correr\n")
        return super.toString()
    }
}