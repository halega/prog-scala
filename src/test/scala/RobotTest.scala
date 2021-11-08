import org.scalatest.flatspec.AnyFlatSpec

class RobotTest extends AnyFlatSpec {
  "An english robot" should "welcome by name" in {
    val name = "Tom"
    val country = "USA"
    val n = "Stas"
    assert(new EnglishRobot(name, country).welcome(n) == s"Welcome $n, I am $name from the country of $country!")
  }

  "An italian robot" should "says his name" in {
    val name = "Robert"
    assert(new ItalianRobot(name).welcome("Kate").contains(s"Il mio nome e' $name"))
  }
}
