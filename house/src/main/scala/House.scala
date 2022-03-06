object House:
  val phrases = List(
    "the house that Jack built.",
    "the malt that lay in",
    "the rat that ate",
    "the cat that killed",
    "the dog that worried",
    "the cow with the crumpled horn that tossed",
    "the maiden all forlorn that milked",
    "the man all tattered and torn that kissed",
    "the priest all shaven and shorn that married",
    "the rooster that crowed in the morn that woke",
    "the farmer sowing his corn that kept",
    "the horse and the hound and the horn that belonged to"
  )

  def recite(firstVerseIndex: Int, lastVerseIndex: Int): String =
    def reciteAcc(firstVerseIndex: Int, lastVerseIndex: Int, acc: String): String =
      if firstVerseIndex > lastVerseIndex then acc
      else
        var result = s"This is ${phrases(firstVerseIndex-1)}"
        for
          index <- Range(firstVerseIndex -1, 0, -1)
        do
          result = result.++(s" ${phrases(index - 1)}")
        reciteAcc(firstVerseIndex + 1, lastVerseIndex, acc ++ s"$result\n")
    reciteAcc(firstVerseIndex, lastVerseIndex, "") + "\n"