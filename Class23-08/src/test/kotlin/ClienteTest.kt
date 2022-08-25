import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente = Cliente("", "", "")

    @BeforeEach
    fun lista()
    {
        cliente.addCompras("agua")
        cliente.addCompras("mel")
        cliente.addCompras("bolacha")
        cliente.addCompras("leite")
    }

    @Test
    fun addComprasTest() {
        assertEquals(4, cliente.listComp.size)
        assertTrue(cliente.listComp.contains("agua"))
    }

    @Test
    fun remComprasTest() {
        cliente.remCompras("agua")
        assertEquals(3, cliente.listComp.size)
    }

}