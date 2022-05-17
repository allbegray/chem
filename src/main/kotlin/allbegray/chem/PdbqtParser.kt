package allbegray.chem

import java.io.InputStream

class PdbqtParser : Parser {
    override fun delimiter(): String = "ENDMDL"

    override fun splitToSequence(`is`: InputStream): Sequence<String> {
        TODO("Not yet implemented")
    }
}