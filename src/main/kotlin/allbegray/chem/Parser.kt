package allbegray.chem

import allbegray.chem.SeparatorPosition.*
import java.io.InputStream

interface Parser {
    fun delimiter(): String

    fun separatorPosition(): SeparatorPosition = TAIL

    fun splitToSequence(`is`: InputStream): Sequence<String> {
        val reader = `is`.bufferedReader()
        val lineSequence = reader.lineSequence()
        return sequence {
            val remain = lineSequence.reduce { acc, s ->
                if (acc.isNotBlank() && s == delimiter()) {
                    yield(
                        when (separatorPosition()) {
                            HEAD -> acc
                            TAIL -> "$acc\n${delimiter()}"
                        }.trim()
                    )
                    when (separatorPosition()) {
                        HEAD -> delimiter()
                        TAIL -> ""
                    }
                } else {
                    "$acc\n$s"
                }
            }
            if (remain.isNotEmpty()) yield(remain.trim())
        }
    }
}