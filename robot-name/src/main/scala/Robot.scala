import scala.util.Random

class Robot() {

  private var _name = generateRandomName()

  def reset() = {
    _name = generateRandomName()
  }

  def name(): String = _name

  private def generateRandomName(): String =
    s"${generateLetters()}${generateNumbers()}"

  private def generateLetters(): String =
    Random.alphanumeric.filter(_.isLetter).take(2).mkString.toUpperCase

  private def generateNumbers(): String =
    Random.alphanumeric.filter(_.isDigit).take(3).mkString
}
