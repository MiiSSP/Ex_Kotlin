/*
 Faça um programa em que o usuário digite o diâmetro de um
 círculo e calcule a área e o perímetro dele
 */

fun main()
{
    println ("Bem vinde!!")
    print ("Informe o diâmetro do circulo a ser calculado: ")
    val dia = readln().toDouble()

    val pi = 3.14
    println ("A area deste circulo é ${((dia * dia * pi)/4)}")
    println ("O perimetro deste circulo é ${(pi * dia)}")

}