class Bowling2(points: Int, previousScore: Int, rollTurn: Int, nextHasToBeTwice: Boolean)

class Bowling(scores: List[Int] = List.empty):

//  val scores: List[Int] = new Array[Int]();

//  def this() = this(0, 0, 1, false)

//  def roll2(score: Int): Bowling2 =
//    if previousScore == 10 && nextHasToBeTwice then
//      return new Bowling(points + score*2, score, rollTurn + 1, true)
//    if score == 10 then
//      return new Bowling(points + score, score, rollTurn + 2, true)
//    if rollTurn % 2 == 0 && score + previousScore == 10 then return new Bowling(points + score, score, rollTurn + 1, rollTurn != 20)
//    if nextHasToBeTwice then return new Bowling(points + score*2, score, rollTurn + 1, false)
//    else return new Bowling(points + score, score, rollTurn + 1, false)

  def roll(score: Int): Bowling =
    new Bowling(scores :+ score);

  def score(): Either[Boolean, Int] =
    val result = scores.sum()
    Right(result)
