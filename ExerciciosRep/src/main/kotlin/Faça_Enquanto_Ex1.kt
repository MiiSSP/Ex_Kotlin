/*
Faça um programa que mostre uma contagem na tela de 233 a 456,
só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */

fun main ()
{
  var cont = 233

  do
  {
    println (cont)
    cont = (cont + 5)
  }
  while (cont <= 299)

  do
  {
    println (cont)
    cont = (cont + 3)
  }
  while (cont <= 400)

  do
  {
    println (cont)
    cont = (cont + 5)
  }
  while (cont <= 456)
}