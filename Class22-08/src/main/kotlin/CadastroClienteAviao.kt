fun main ()
{
    val cliente = Cliente ()
    val aviao = Aviao (classe = "", companhia = "", destino = "", horario = "", qPassagens = 0)

    println("Bem vinde a seção de cadastros LIZ viagens!!")

    println("\nA seguir preencha as informações solicitadas")

    cliente.cadastro()
    aviao.cadViagem()

    println("\nVisualização final do cadastro")
    cliente.previewC()
    aviao.previewV()

}