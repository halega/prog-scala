class Robot(n: String) {
  val name: String = "Robot " + n

  def welcome(name: String): String = s"Hi $name! I'm ${this.name}"
}

class ItalianRobot(n: String) extends Robot(n) {
  override def welcome(name: String): String = s"Benvenuto $name! Il mio nome e' ${this.name}"
}

class EnglishRobot(name: String, country: String) extends Robot(name) {
  override def welcome(n: String): String = s"Welcome $n, I am $name from the country of $country!"
}