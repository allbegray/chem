package allbegray.chem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Mol2ParserTest {

    @Test
    fun splitToSequenceTest() {
        val stream = Mol2ParserTest::class.java.getResourceAsStream("/mol2/model_2.mol2")!!
        stream.use {
            val models = Mol2Parser().splitToSequence(it).toList()
            assertEquals(2, models.size)
        }
    }
}