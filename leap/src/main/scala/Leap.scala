object Leap {

  def leapYear(year: Int): Boolean =
    isDivisibleBy4(year) && (!isDivisibleBy100(year) || isDivisibleBy400(year))

  private def isDivisibleBy4(year: Int): Boolean = year % 4 == 0

  private def isDivisibleBy100(year: Int) = year % 100 == 0

  private def isDivisibleBy400(year: Int) = year % 400 == 0

}
