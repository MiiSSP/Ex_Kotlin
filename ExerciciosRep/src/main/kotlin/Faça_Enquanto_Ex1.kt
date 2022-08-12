/*
Faça um programa que mostre uma contagem na tela de 233 a 456,
só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */

fun main ()
{
  var Cont = 233

  do
  {
    println (Cont)
    Cont = (Cont + 5)
  }
  while (Cont <= 299)

  do
  {
    println (Cont)
    Cont = (Cont + 3)
  }
  while (Cont >= 300 && Cont <= 400)

  do
  {
    println (Cont)
    Cont = (Cont + 5)
  }
  while (Cont >= 400 &&  Cont <= 456)
}