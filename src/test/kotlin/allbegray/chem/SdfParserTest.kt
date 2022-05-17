package allbegray.chem

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SdfParserTest {

    @Test
    fun splitToSequenceTest1() {
        val stream = SdfParserTest::class.java.getResourceAsStream("/sdf/model_1.sdf")!!
        stream.use {
            val models = SdfParser().splitToSequence(it).toList()
            assertEquals(1, models.size)
        }
    }

    @Test
    fun splitToSequenceTest() {
        val stream = SdfParserTest::class.java.getResourceAsStream("/sdf/model_2.sdf")!!
        stream.use {
            val models = SdfParser().splitToSequence(it).toList()
            assertEquals(2, models.size)
        }
    }
}