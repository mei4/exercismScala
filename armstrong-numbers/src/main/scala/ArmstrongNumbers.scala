import scala.math.pow

object ArmstrongNumbers:

  def isArmstrongNumber(number: Int) = {
    val numberAsString = number.toString
    val length = numberAsString.length

    numberAsString.map(_.asDigit).fold(0)((x, y) => x + pow(y, length).toInt) == number
  }