import org.scalatest.flatspec.AnyFlatSpec

class RobotTest extends AnyFlatSpec {

  "An EnglishRobot" should "welcome by name" in {
    val name = "Tom"
    val country = "USA"
    val n = "Stas"
    assert(new EnglishRobot(name, country).welcome(n) == s"Welcome $n, I am $name from the country of $country!")
  }

  "An ItalianRobot" should "welcome by name" in {
    val name = "Tom"
    val country = "USA"
    val n = "Stas"
    assert(new ItalianRobot(name).welcome(n) == s"Benvenuto $n! Il mio nome e' Robot $name")
  }

  "An ItalianRobot" should "says his name" in {
    val name = "Robert"
    assert(new ItalianRobot(name).welcome("").contains(s"Il mio nome e' Robot $name"))
  }

  "Cast to Robot" should "give access to Robot.name field" in {
    val robot: Robot = new ItalianRobot("Mark")
    assert(robot.name == "Robot Mark")
  }

  "Robot.name" should "begin with the word Robot" in {
    assert(new Robot("M").name == "Robot M")
  }
}
