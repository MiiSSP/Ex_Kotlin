/*
 O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
 */

fun main()
{
    println ("Olá!!")
    print ("Informe sua idade: ")
    val idade = readln().toInt()

    print ("Você já fez aniversario este ano? (responda com sim ou não) ")
    val ani = readln()

    if (ani == "sim")
    {
        print ("Então significa que você nasceu em ${2022-idade}")
    }

   else
    {
        print("Então significa que você nasceu em ${2022 - idade - 1}")
    }
}