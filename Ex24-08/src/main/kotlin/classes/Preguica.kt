package classes

class Preguica (nome: String, idade: Int, som: String):Animal(nome, idade, som)
{
    var escalar = ""

    override fun nome()
    {
        print("Informe o nome do bicho preguiça: ")
        nome = readln()
    }

    override fun idade() {
        print("Informe a idade que o bicho preguiça tem: ")
        idade = readln().toInt()
    }

    override fun som() {
        print("Qual o nome do som que este bicho preguiça emite: ")
        som = readln()
    }

    override fun movimento()
    {
        print("Altura maxima que este bicho preguiça consegue escalar uma arvore: ")
        escalar = readln()
    }

    override fun toString(): String
    {
        println("---BICHO PREGUIÇA---")
        println("Nome:$nome\n" +
                "Idade: $idade\n" +
                "Som emitido: $som\n" +
                "Altura maxima de escalada: $escalar\n")
        return super.toString()
    }
}