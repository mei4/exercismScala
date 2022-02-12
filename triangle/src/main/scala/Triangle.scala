class Triangle(c1: Double, c2: Double, c3: Double):
  val (equilateral, isosceles, scalene) = evaluateShape()

  private def evaluateShape(): (Boolean, Boolean, Boolean) =
    def isTriangleInequal() =
      if c1 <= 0 || c2 <= 0 || c3 <= 0 then false
      else if c1 + c2 < c3 || c1 + c3 < c2 || c2 + c3 < c1 then false
      else true

    if !isTriangleInequal() then (false, false, false)
    else
      if c1 == c2 && c2 == c3 then (true, true, false)
      else if c1 != c2 && c1 != c3 && c2 != c3 then (false, false, true)
      else (false, true, false)
