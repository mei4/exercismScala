class Bowling(points: Int):

  def this() = this(0)

  def roll(score: Int): Bowling =
    new Bowling(points + score)

  def score(): Either[Boolean, Int] = Right(points)
