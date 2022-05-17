package allbegray.chem

class Mol2Parser : Parser {
    override fun delimiter(): String = "@<TRIPOS>MOLECULE"

    override fun separatorPosition(): SeparatorPosition = SeparatorPosition.HEAD
}
