class Robot(n: String) {
  val name: String = "Robot " + n
}

class ItalianRobot(n: String) extends Robot(n) {
  def welcome(name: String): String = s"Benvenuto $name! Il mio nome e' ${this.name}"
}

class EnglishRobot(name: String, country: String) extends Robot(name) {
  def welcome(n: String): String = s"Welcome $n, I am $name from the country of $country!"
}
