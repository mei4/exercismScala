class DNA(strand: String) {

  def nucleotideCounts: Either[Boolean, Map[Char, Int]] = {
    def countSymbol(symbol: Char): Int = {
      strand.count(_ == symbol)
    }

    def isInvalidSymbolInStrand(letter: Char): Boolean = {
      !List('A', 'C', 'G', 'T').contains(letter)
    }

    if (strand.exists(isInvalidSymbolInStrand))
      Left(false)
    else {
      val result = Map(
        'A' -> countSymbol('A'),
        'C' -> countSymbol('C'),
        'G' -> countSymbol('G'),
        'T' -> countSymbol('T')
      )
      Right(result)
    }
  }
}
