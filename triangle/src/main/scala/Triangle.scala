class Triangle(c1: Double, c2: Double, c3: Double):
  val (equilateral, isosceles, scalene, degenerate) = evaluateShape()

  private def evaluateShape(): (Boolean, Boolean, Boolean, Boolean) =
    def isTriangleInequal() =
      if c1 <= 0 || c2 <= 0 || c3 <= 0 then false
      else if c1 + c2 < c3 || c1 + c3 < c2 || c2 + c3 < c1 then false
      else true

    def isDegeneratedTriangle() = c1 + c2 == c3 || c1 + c3 == c2 || c2 + c3 == c1

    if !isTriangleInequal() then (false, false, false, false)
    else if isDegeneratedTriangle() then (false, false, false, true)
    else
      if c1 == c2 && c2 == c3 then (true, true, false, false)
      else if c1 != c2 && c1 != c3 && c2 != c3 then (false, false, true, false)
      else (false, true, false, false)
