import CustomTypes.{Bearing, Coordinates}

case class Robot(bearing: Bearing.Value, coordinates: Coordinates) {

  def simulate(instructions: String): Robot =
    instructions.foldLeft(this) { (robot, instruction) =>
      robot.executeInstruction(instruction)
    }

  private def executeInstruction(instruction: Char): Robot =
    instruction match {
      case 'A' => advance
      case 'R' => turnRight
      case 'L' => turnLeft
    }

  def turnRight: Robot = {
    val newBearing = bearing match {
      case Bearing.North => Bearing.East
      case Bearing.East  => Bearing.South
      case Bearing.South => Bearing.West
      case Bearing.West  => Bearing.North
    }
    this.copy(bearing = newBearing)
  }

  def turnLeft: Robot = {
    val newBearing = bearing match {
      case Bearing.North => Bearing.West
      case Bearing.West  => Bearing.South
      case Bearing.South => Bearing.East
      case Bearing.East  => Bearing.North
    }
    this.copy(bearing = newBearing)
  }

  def advance: Robot = {
    val newCoordinates = bearing match {
      case Bearing.North => (coordinates._1, coordinates._2 + 1)
      case Bearing.West  => (coordinates._1 - 1, coordinates._2)
      case Bearing.South => (coordinates._1, coordinates._2 - 1)
      case Bearing.East  => (coordinates._1 + 1, coordinates._2)
    }
    this.copy(coordinates = newCoordinates)
  }
}
