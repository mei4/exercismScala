object CustomTypes {
  type Coordinates = (Int, Int)

  object Bearing extends Enumeration {
    val North, South, East, West = Value
    Either.cond()
  }
}
