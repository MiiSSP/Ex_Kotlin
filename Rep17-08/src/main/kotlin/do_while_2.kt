/*
Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).
 */
 fun main ()
 {
     var s = 0
     var c = 0

     println("Bem vinde!!")

     do
     {
         print("Informe o número inteiro aqui: ")
         val n = readln().toInt()

         if (n % 3 == 0 && n != 0)
         {
             c ++
             s += n
         }
     }
         while (n != 0)

         println("\nA média dos números multiplos de 3 informados é ${s/c}")
 }