class Rational(n: Int, d: Int) {
  require(d != 0)

  println("Created " + n + "/" + d)

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = s"$numer/$denom"

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
}
