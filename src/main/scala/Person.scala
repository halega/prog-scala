abstract class Person(name: String, age: Int = 0) {
  def presentYourself = s"$name is $age years old"
  def hello(name: String): String
}

class Teacher(name: String, age: Int = 0) extends Person(name, age) {
  def hello(name: String) = s"Hello, $name! I'm a teacher ${this.name}, $age years old."
}

class Student(name: String, age: Int = 0, ID: Int = 0) extends Person(name, age) {
  def hello(name: String) = s"Hello, $name! I'm a student ${this.name}, $age years old. My ID is $ID."
}