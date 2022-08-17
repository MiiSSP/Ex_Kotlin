/*
Faça um programa que entre com três números e coloque em ordem crescente.
 */
fun main()
{
    print("Insira o primeiro número aqui: ")
    val a = readln().toDouble()

    print("Insira o segundo número aqui: ")
    val b = readln().toDouble()

    print("Insira o terceiro número aqui: ")
    val c = readln().toDouble()

    if (b in a..c)
    {
        println ("Seus números são: $a, $b, $c")
    }
    else if (c in a..b)
    {
        println ("Seus números são: $a, $c, $b")
    }
    else if (a in b..c)
    {
        println ("Seus números são: $b, $a, $c")
    }
    else if (c in b..a)
    {
        println ("Seus números são: $b, $c, $a")
    }
    else if (b in c..a)
    {
        println ("Seus números são: $c, $b, $a")
    }
    else
    {
        println ("Seus números são: $c, $a, $b")
    }
}