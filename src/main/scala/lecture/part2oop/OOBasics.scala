package lecture.part2oop
class Person (name: String, age: Int) {
  // body
  val x = 2

  // METHOD
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // OVERLOADING
  def greet(): Unit = println(s"Hi, I am $name")

  // MULTIPLE CONSTRUCTURE
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

  // OVERRIDE toString
  override def toString: String = s"Person(name: $name, age: $age, x: $x)"
}

object OOBasics extends App {
  val person = new Person ("John", 26)

  println(person)
  person.greet("Daniel")
  person.greet()
}

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
class novelAndWriter (first_name: String,
                      surname: String,
                      year: Int,
                      novel_name: String,
                      year_of_release: Int,
                      author: String
                     ) {
  // METHOD
  def fullName(): Unit =
      println(s"$first_name $surname")                // RETURN FULL NAME
  def authorAge() =
      println(year)                                   // RETURN AUTHOR AGE
  def isWrittenByauthor() =
      println(s"$first_name $surname" == s"$author")  // RETURN AUTHOR AGE

}

object OObasics_novelAndWriter extends App {
  val novelAndWriter = new novelAndWriter("Mia",
                                          "Lu",
                                          1992,
                                          "Learning Scala",
                                          2023,
                                          "Mia Lu"
  )
  novelAndWriter.fullName()
  novelAndWriter.authorAge()
  novelAndWriter.isWrittenByauthor()
}







/*
Fixed Values: If a value is fixed and does not vary between instances of a class,
defining it in the body makes sense because it does not need to be customized during each object instantiation.

Non-unique Attributes: Similarly, attributes that don’t contribute to the uniqueness or essential characteristics of the objects can also be defined in the body.
These values might not be essential for constructing a meaningful instance of the class.
 */
