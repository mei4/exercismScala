object Hamming {

  def distance(dna1: String, dna2: String): Option[Int] = {
    if (dna1.size == dna2.size) {
      val piecesPairs = dna1.zip(dna2)
      val mistakes = piecesPairs.count(pair => pair._1 != pair._2)
      Some(mistakes)
    } else None
  }
}
