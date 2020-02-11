object SpaceAge {

  def onEarth(ageInSeconds: Double): Double =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.EARTH)

  def onMercury(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.MERCURY)

  def onMars(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.MARS)

  def onVenus(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.VENUS)

  def onJupiter(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.JUPITER)

  def onSaturn(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.SATURN)

  def onUranus(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.URANUS)

  def onNeptune(ageInSeconds: Double) =
    getAgeInOrbitalPeriod(ageInSeconds, OrbitalPeriods.NEPTUNE)

  private def getAgeInOrbitalPeriod(ageInSeconds: Double,
                                    orbitalPeriod: Double) =
    convertAgeFromSecondsToDays(ageInSeconds) / orbitalPeriod

  private def convertAgeFromSecondsToDays(ageInSeconds: Double) =
    ageInSeconds / 60 / 60 / 24

}
