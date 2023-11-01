package lecture.part1basics

object StringOps extends App{

  //COMMON STRING FUNCTION
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))                               //EXTRACT A SINGLE CHARACTER

  println(str.substring(7, 11))                        //EXTRACT A SEQUENCE OF STRING

  println(str.split(" ").toList)                //SPLIT STRING TO LIST

  println(str.startsWith("Hello"))                     //TEST IF STRING START WITH "Hello"

  println(str.replace(",", "!"))    //REPLACE CHAR

  println(str.toLowerCase())                           //TO LOWER CASE

  println(str.length)                                  //COUNT LENGTH OF A STRING

  println(str.reverse)                                 //REVERSE A STRING

  println(str.take(2))                                 //TAKE FIRST TWO CHAR FROM A STRING


  //CONVERT STRING TO INT
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println('a' + aNumberString + 'z')

}

//SCALA SPECIFIC: STRING INTERPOLATOR
object StringInterpolator extends App{
  val name = "David"
  val age = 12

  // S - INTERPOLATOR
  val greeting = s"Hello, my name is $name and my age is $age"
  println(greeting)

  val anotherGreeting = s"Hello, my name is $name and my age is ${age + 1}"
  println(anotherGreeting)

  // F - INTERPOLATOR
  val speed = 1.2f
  val fGreeting = f"$name can eat $speed%2.2f burgers per minute"
  println(fGreeting)

  // RAW - INTERPOLATOR
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}