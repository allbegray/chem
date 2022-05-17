package allbegray.chem

import java.io.InputStream

class SdfParser : Parser {
    override fun delimiter(): String = "\$\$\$\$"

    override fun splitToSequence(`is`: InputStream): Sequence<String> {
        val reader = `is`.bufferedReader()
        val lineSequence = reader.lineSequence()
        return sequence {
            val remain = lineSequence.reduce { acc, s ->
                if (s == delimiter()) {
                    yield("$acc\n${delimiter()}".trim())
                    ""
                } else {
                    "$acc\n$s"
                }
            }
            if (remain.isNotEmpty()) yield(remain.trim())
        }
    }
}
