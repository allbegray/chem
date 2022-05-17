package allbegray.chem

import java.io.InputStream

interface Parser {
    fun delimiter(): String

    fun splitToSequence(`is`: InputStream): Sequence<String>
}