/*
Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
 */


fun main()
{
    print ("Olá, informe a idade do nadador, aqui: ")
    val idade = readln().toInt()

    if (idade >= 5 && idade < 8)
    {
        println ("O(a) nadador(a) pertence a categoria infantil A")
    }

    if (idade >=8 && idade < 12)
    {
        println ("O(a) nadador(a) pertence a categoria infantil B")
    }

    if (idade == 12 || idade == 13)
    {
        println ("O(a) nadador(a) pertence a categoria juvenil A")
    }

    if (idade >= 14 && idade < 18)
    {
        println ("O(a) nadador(a) pertence a categoria juvenil B")
    }

    if (idade >= 18)
    {
        println ("O(a) nadador(a) pertence a categoria dos adultos")
    }

    if (idade < 5)
    {
        println ("O(a) nadador(a) não possui a idade minima necessaria")
    }
}