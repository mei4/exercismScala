import scala.math.pow

object ArmstrongNumbers:
  def isArmstrongNumber(number: Int) =
    val length = number.toString.length
    val numberAsList: List[Double] = number.toString.map(_.asDigit.toDouble).toList
    val sumOfNumbers = numberAsList.fold[Double](0)((x, y) => x + pow(y, length))
    if sumOfNumbers.toInt == number then true
    else false