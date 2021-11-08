class Person(name: String, age: Int = 0) {
  def presentYourself = s"$name is $age years old"
}

class Teacher(name: String, age: Int = 0) extends Person(name, age)

class Student(name: String, age: Int = 0, ID: Int = 0) extends Person(name, age)