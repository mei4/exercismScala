import scala.math.pow

object ArmstrongNumbers:

  def isArmstrongNumber(number: Int) = {
    val numberAsString = number.toString
    val length = numberAsString.length

    numberAsString.map(digitAsChar => pow(digitAsChar.asDigit, length)).sum == number
  }