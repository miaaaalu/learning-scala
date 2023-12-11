package lecture.part2oop

import org.w3c.dom.css.Counter

/** BASIC LEARNING
 *
 */

class Person (name: String, age: Int) {
  // body
  val x = 2

  // METHOD
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // OVERLOADING
  def greet(): Unit = println(s"Hi, I am $name")

  // MULTIPLE CONSTRUCTOR
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

/** PRACTICE COUNTER CLASS
 * == RECEIVES AN INT VALUE
 * == METHOD CURRENT COUNT
 * == METHOD TO INCREMENT/DECREMENT => NEW COUNTER
 * == OVERLOAD INC/DEC TO RECEIVE AN AMOUNT
 */

/*
class counter (val count: Int) {
  def testInc = count + 1

  //INCREMENT
  def inc = {
    println("incrementing")
    new counter (count + 1)
  }
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  //DECREMENT
  def dec = {
    println("decrementing")
    new counter (count - 1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}

object counter extends App {
  val counter = new counter (0)
  println(counter.testInc())

}

WHENEVER YOU NEED TO MODIFY THE CONTENT OF AN INSTANCE, SUGGEST BUILD A NEW ISTANCE
Fixed Values: If a value is fixed and does not vary between instances of a class,
defining it in the body makes sense because it does not need to be customized during each object instantiation.

Non-unique Attributes: Similarly, attributes that don’t contribute to the uniqueness or essential characteristics of the objects can also be defined in the body.
These values might not be essential for constructing a meaningful instance of the class.
 */
