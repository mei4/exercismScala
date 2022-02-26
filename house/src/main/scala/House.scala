object House:
  val phrases = List(
    "the house that Jack built.",
    "the malt",
    "the rat",
    "the cat",
    "the dog",
    "the cow with the crumpled horn",
    "the maiden all forlorn",
    "the man all tattered and torn",
    "the priest all shaven and shorn",
    "the rooster that crowed in the morn",
    "the farmer sowing his corn",
    "the horse and the hound and the horn"
  )
  val verbs = List(
    "lay in",
    "ate",
    "killed",
    "worried",
    "tossed",
    "milked",
    "kissed",
    "married",
    "woke",
    "kept",
    "belonged to"
  )

  def recite(firstVerseIndex: Int, lastVerseIndex: Int): String =
    def reciteVerse(verseNumber: Int) =
      if verseNumber == 1 then s"This is ${phrases(verseNumber-1)}\n"
      else
        var result = s"This is ${phrases(verseNumber-1)}"
        for
          index <- Range(verseNumber -1, 0, -1)
        do
          result = result.++(s" that ${verbs(index - 1)} ${phrases(index - 1)}")
        s"$result\n"
    
    var result = ""
    for index <- Range(firstVerseIndex, lastVerseIndex + 1) do
      result = result ++ reciteVerse(index)
    s"$result\n"
