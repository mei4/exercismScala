import scala.collection.mutable.ListBuffer

object SecretHandshake {
  def commands(command: Int): List[String] = {
    var result: ListBuffer[String] = ListBuffer.empty

    if ((command & 1) == 1) result += "wink"
    if ((command & 2) == 2) result += "double blink"
    if ((command & 4) == 4) result += "close your eyes"
    if ((command & 8) == 8) result += "jump"
    if ((command & 16) == 16) result = result.reverse

    result.toList
  }
}
