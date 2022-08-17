/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */

fun main ()
{
    var c = 1
    var idade = 0
    var s = 0
    var s1 = 0
    var s2 = 0

    println("Bem Vinde!!")

    while (idade in 0 ..98)
    {
        print("Informe a idade da ${c++} ª pessoa: ")
        idade = readln().toInt()

        if (idade < 21)
        {
            s ++
        }
        else if (idade > 50)
        {
            s1 ++
        }
        else
        {
            s2 ++
        }
    }

    println("\nTotal de pessoas com menos de 21 anos é $s")
    println("Total de pessoas com mais de 50 anos é $s1")
    println("Total de pessoas com idade entre 21 e 50 anos é $s2")



}