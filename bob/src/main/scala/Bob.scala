object Bob {

  def response(statement: String): String = {
    val isUpperCaseStatement = statement == statement.toUpperCase
    val lastCharacter = statement.trim.takeRight(1)
    val allCharactersButLastAreLetters =
      statement.dropRight(1).filterNot(_.isWhitespace).forall(_.isLetter)

    val isEmptyStatement = statement.forall(_.isWhitespace)
    val isAQuestion = lastCharacter == "?"
    val isAShoutingQuestion = isUpperCaseStatement && allCharactersButLastAreLetters && isAQuestion
    val isShouting = isUpperCaseStatement && (allCharactersButLastAreLetters || lastCharacter == "!")

    if (isEmptyStatement) "Fine. Be that way!"
    else if (isAShoutingQuestion) "Calm down, I know what I'm doing!"
    else if (isShouting) "Whoa, chill out!"
    else if (isAQuestion) "Sure."
    else "Whatever."
  }
}
