package allbegray.chem

class PdbqtParser : Parser {
    override fun delimiter(): String = "ENDMDL"
}