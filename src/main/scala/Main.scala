object Main extends App {
  val tom = new ItalianRobot("Tom")
  val mark = new EnglishRobot("Mark", "USA")
  println(tom.name)
  println(mark.name)
  println(mark.welcome("n"))

  println(new Person("Bob").presentYourself)
  println(new Person("Martin", 18).presentYourself)
}
