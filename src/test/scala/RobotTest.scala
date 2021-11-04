import org.scalatest.flatspec.AnyFlatSpec

class RobotTest extends AnyFlatSpec {
  "A robot" should "welcome by name" in {
    val name = "Tom"
    val n = "Stas"
    assert(new Robot(name).welcome(n) == s"Welcome $n! My name is $name")
  }

  "A robot" should "says his name" in {
    val name = "Robert"
    assert(new Robot(name).welcome("Kate").contains(s"My name is $name"))
  }
}
