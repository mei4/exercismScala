class Bowling(points: Int, previousScore: Int, rollTurn: Int, nextHasToBeTwice: Boolean):

  def this() = this(0, 0, 1, false)

  def roll(score: Int): Bowling =
    if previousScore == 10 && nextHasToBeTwice then
      return new Bowling(points + score*2, score, rollTurn + 1, true)
    if score == 10 then
      return new Bowling(points + score, score, rollTurn + 2, true)
    if rollTurn % 2 == 0 then
      if score + previousScore == 10 then return new Bowling(points + score, score, rollTurn + 1, rollTurn != 20)
    if nextHasToBeTwice then return new Bowling(points + score*2, score, rollTurn + 1, false)
      else return new Bowling(points + score, score, rollTurn + 1, false)

  def score(): Either[Boolean, Int] = Right(points)
