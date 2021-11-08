object Main extends App {
  val tom = new Robot("Tom")
  val unknown = new Robot
  println(tom.name)
  println(unknown.name)
  println(new Robot().welcome("n"))

  println(new Person("Bob").presentYourself)
  println(new Person("Martin", 18).presentYourself)
}
