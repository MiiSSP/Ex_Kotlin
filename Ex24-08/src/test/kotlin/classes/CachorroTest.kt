package classes

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CachorroTest {

    val dog = Cachorro(nome = "ana",idade = 10,som = "auau")


    @Test
    fun nome() {
        assertEquals( "ana", dog.nome)
    }

    @Test
    fun idade() {
        assertEquals( 10, dog.idade)
    }

    @Test
    fun som() {
        assertEquals("auau", dog.som)
    }

}