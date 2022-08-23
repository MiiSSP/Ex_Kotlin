fun main ()
{
    val paciente = Paciente (nome = "", idade = 0, cpf = "", rg = "", sintomas = "")

    println("Ficha de pacientes")

    println("\nA seguir preencha as informações solicitadas")

    paciente.ficha()

    println("\nVisualização final da ficha")
    paciente.previewFicha()

}