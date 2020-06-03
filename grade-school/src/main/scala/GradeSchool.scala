class School {
  type DB = Map[Int, Seq[String]]
  var database: DB = Map()

  def add(name: String, g: Int) =
    database = db + (g -> (grade(g) :+ name))

  def db: DB = database

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted: DB =
    db.mapValues(_.sorted).toSeq.sortBy(_._1).toMap
}
