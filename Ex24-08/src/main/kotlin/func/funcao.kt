package func

import classes.Cachorro
import classes.Cavalo
import classes.Preguica

val dog = Cachorro(nome = "", idade = 0, som = "")
val cav = Cavalo(nome = "", idade = 0, som = "")
val bpg = Preguica(nome = "", idade = 0, som = "")

fun menu()
{
    while (true)
    {
        println("\n............BICHINHOS DO CORAÇÃO............")
        println("\n....................MENU....................")

        println("\n1 - Cadastrar um animal")
        println("2 - Apresentar lista de animais ja cadastrados")
        println("3 - Sair do sistema")

        print("\nInsira o número correspondente a opção escolhida: ")

        when (readln().toInt()) {
            1 -> cadastro()
            2 -> lista()
            3 -> break
            else -> println("Opção Invalida")
        }
    }
}


fun cadastro()
{
    while (true)
    {
        println("\n.............SEÇÃO DE CADASTRO..............")

        println("\n1 - Cachorro ")
        println("2 - Cavalo")
        println("3 - Bicho Preguiça")
        println("4 - Retornar ao menu principal")
        println("5 - Sair")

        print("\nInsira o número referente a opção deseja: ")
        println ("")

        when (readln().toInt())
        {
            1 -> {dog.nome(); dog.idade(); dog.som(); dog.movimento()}
            2 -> {cav.nome(); cav.idade(); cav.som(); cav.movimento()}
            3 -> {bpg.nome(); bpg.idade(); bpg.som(); bpg.movimento()}
            4 -> menu()
            5 -> break
            else -> println("Opção Invalida")
        }
    }
}

fun lista ()
{
    while (true) {

        println("\n.............SEÇÃO DE LISTAGEM..............")

        println("\n1 - Cachorro ")
        println("2 - Cavalo")
        println("3 - Bicho Preguiça")
        println("4 - Todos os bichos")
        println("5 - Retornar ao menu principal")
        println("6 - Sair do sistema")


        print("\nInsira o número referente a opção deseja: ")

        when (readln().toInt())
        {
            1 -> {dog.toString(); break}
            2 -> {cav.toString(); break}
            3 -> {bpg.toString(); break}
            4 -> {dog.toString(); cav.toString(); bpg.toString(); break}
            5 -> menu()
            6 -> break
            else -> println("Opção Invalida")
        }
    }
}