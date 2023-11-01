package lecture.part1basics
import scala.annotation.tailrec
import scala.jdk.Accumulator

// WHEN YOU NEED LOOPS, USE TAIL RECURSION
object recursion_1 extends App {
  def recursion_1(n: Int): Int =
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * recursion_1(n-1)
      println("computing factorial of " + n)
      result
    }
  println(recursion_1(5))

  def tail_recursion(n: Int): BigInt = {
    @tailrec
    def facthelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else facthelper(x - 1, x * accumulator)

    facthelper(n, 1)
  }

  println(tail_recursion(5))
}


object tail_string_recursion extends App {
  def tail_string_recursion(aString: String, n: Int, accumulator: String): String = {
      if (n <= 0) accumulator
      else tail_string_recursion(aString, n-1, aString + " " + accumulator)
  }
  println(tail_string_recursion("hello", 3, " "))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  print(aRepeatedFunction("hello", 3))
}

/*
object tail_fibonacci_recursion extends App {
  def fibonacci(n: Int): Int = {
    def tail_fibonacci_recursion(x: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else tail_fibonacci_recursion(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else tail_fibonacci_recursion(2, 1, 1)
    }
  }
  println(fibonacci(8))
}
*/

/*
2. IsPrime function tail recursive
3. Fibonacci function, tail recursive.


object aFibonacciFunction extends App{
    def aFibonacciFunction(n:Int): Int = {
        if (n <= 2) 1
        else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
    }
    println(aFibonacciFunction(8))
 */

