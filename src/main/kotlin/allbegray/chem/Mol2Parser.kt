package allbegray.chem

import java.io.InputStream

class Mol2Parser : Parser {
    override fun delimiter(): String = "@<TRIPOS>MOLECULE"

    override fun splitToSequence(`is`: InputStream): Sequence<String> {
        TODO("Not yet implemented")
    }
}
