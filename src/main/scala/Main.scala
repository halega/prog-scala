object Main extends App {
  val tom = new ItalianRobot("Tom")
  val mark = new EnglishRobot("Mark", "USA")
  println(tom.name)
  println(mark.name)
  println(tom.welcome("n"))

  println(new Teacher("Bob").hello("Martin"))
  println(new Student("Martin", 18, 1).hello("Bob"))

  new Rational(1, 2)
}
