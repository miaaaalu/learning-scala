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

/** PRACTICE NOVEL AND AUTHOR
 * == RETURN AUTHOR FULL NAME
 * == RETURN AUTHOR AGE
 * == RETURN IF AUTHOR IS AUTHOR
 * == RETURN A NEW INSTANCE WHEN YEAR CHANGED
 */

class Writer (first_name: String, surname: String, val year: Int) {
  // METHOD
  def fullName(): String = s"$first_name $surname"
}

class Novel (novel_name: String, year_of_release: Int, author: Writer) {
  // METHOD
  def authorAge() = year_of_release - author.year

  def isWrittenByauthor(author: Writer) = author == this.author

  def copy (newYear: Int): Novel = new Novel (novel_name, newYear, author)
  //override def toString: String = s"Novel(name: $novel_name, year: $year_of_release, author: ${author.fullName()})"


}

object novelAndWriter extends App {
  val author = new Writer("Mia", "Lu", 1992)

  val novel = new Novel("Scala", 2023, author)

  val updatedNovel = novel.copy(newYear = 45)

  println(author.fullName())
  println(novel.authorAge())
  println(novel.isWrittenByauthor(author))
  println(novel.copy(2028))
}

/** PRACTICE COUNTER
 * == RETURN AUTHOR FULL NAME
 * == RETURN AUTHOR AGE
 * == RETURN IF AUTHOR IS AUTHOR
 * == RETURN A NEW INSTANCE WHEN YEAR CHANGED
 */


/*
Fixed Values: If a value is fixed and does not vary between instances of a class,
defining it in the body makes sense because it does not need to be customized during each object instantiation.

Non-unique Attributes: Similarly, attributes that don’t contribute to the uniqueness or essential characteristics of the objects can also be defined in the body.
These values might not be essential for constructing a meaningful instance of the class.
 */
