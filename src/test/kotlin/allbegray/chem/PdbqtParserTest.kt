package allbegray.chem

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PdbqtParserTest {

    @Test
    fun splitToSequenceTest1() {
        val stream = PdbqtParserTest::class.java.getResourceAsStream("/pdbqt/model_9.pdbqt")!!
        stream.use {
            val models = PdbqtParser().splitToSequence(it).toList()
            assertEquals(9, models.size)
        }
    }
}