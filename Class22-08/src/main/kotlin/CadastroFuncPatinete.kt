fun main () {
    val funcionario = Funcionario()
    val patinete = Patinete()

    println("Você esta na seção de cadastros do EntregAE")

    println("\nA seguir preencha as informações solicitadas")

    funcionario.cadastroF()
    patinete.cadastroP()

    println("\nVisualização final do cadastro")
    funcionario.previewF()
    patinete.previewP()

}