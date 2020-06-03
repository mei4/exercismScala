object Etl {
  def transform(scores: Map[Int, Seq[String]]): Map[String, Int] = {
    scores.flatMap((score: (Int, Seq[String])) => {
      score match {
        case (points, letters) => letters.map(_.toLowerCase -> points).toMap
      }
    })
  }
}
