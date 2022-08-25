fun main ()
{
    println("Bem Vinde a calculadora de preguiçoso")
    println("Insira dois valores a serem multiplicados:")
    val x = readln().toDouble()
    val y = readln().toDouble()

    println("A multiplicação entre $x e $y resulta em ${mult(x,y)}")

}
