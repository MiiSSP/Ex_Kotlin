package classes

abstract class Animal(
    var nome: String,
    var idade: Int,
    var som: String
) {

    abstract fun nome()

    abstract fun idade()

    abstract fun som()

    abstract fun movimento()
}
