object House:
  val phrases = List(
    "the house that Jack built.",
    "the malt that lay in ",
    "the rat that ate ",
    "the cat that killed ",
    "the dog that worried ",
    "the cow with the crumpled horn that tossed ",
    "the maiden all forlorn that milked ",
    "the man all tattered and torn that kissed ",
    "the priest all shaven and shorn that married ",
    "the rooster that crowed in the morn that woke ",
    "the farmer sowing his corn that kept ",
    "the horse and the hound and the horn that belonged to "
  )

  def recite(firstVerseIndex: Int, lastVerseIndex: Int): String =
    def reciteAcc(firstVerseIndex: Int, lastVerseIndex: Int, acc: String, lineIndex: Int): String =
      if firstVerseIndex > lastVerseIndex then s"$acc\n" // end of the song
      else if lineIndex == 0 then reciteAcc(firstVerseIndex + 1, lastVerseIndex, s"$acc\n", firstVerseIndex + 1) // end of one paragraph
      else
        val phrase = phrases(lineIndex - 1)
        val result = if firstVerseIndex == lineIndex then "This is " + phrase else phrase
        reciteAcc(firstVerseIndex, lastVerseIndex, acc + result, lineIndex - 1)
    reciteAcc(firstVerseIndex, lastVerseIndex, "", firstVerseIndex)