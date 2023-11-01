package lecture.part1basics

object functions extends App{
  def aFunction (a: String, b: Int) = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aFunctionWithSideEffects (aString: String): Unit = println(aString)

}

object aParameterlessFunction extends App{
  def aParameterlessFunction() = 42
  println(aParameterlessFunction())
}

object aRepeatedFunction extends App{
  //WHEN YOU NEED LOOPS, USE RECURSION
  //recursion function need to declare function type
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }
  print(aRepeatedFunction("hello", 3))
}

object aBigFunction extends App{
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b:Int): Int = a + b
    aSmallerFunction(n,n-1)
  }
  print(aBigFunction(4))
}

//1. A greeting function (name, age) ==> "Hi, my name is $name and I am &age years old"
object aGreetingFunction extends App{
  def aGreetingFunction(name: String, age: Int) = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(aGreetingFunction("Nancy", 18))
}

//2.Factorial function 1 * 2 * 3 ... * n
object aFactorialFunction extends App{
  def aFactorialFunction(n:Int): Int = {
    if (n <=0 ) 1
    else n * aFactorialFunction(n-1)
  }
  println(aFactorialFunction(4))
}

//3. A Fibonacci function
//  f(1) = 1
//  f(2) = 1
//  f(n) = f(n - 1) + f(n - 2）
//7+6+5+4+3+2

object aFibonacciFunction extends App{
  def aFibonacciFunction(n:Int): Int = {
    if (n <= 2) 1
    else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
  }
  println(aFibonacciFunction(8))
}

// 4. Tests if a number is prime
object test extends App {
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    if(n <= 1) false // This is added to handle cases where n is less than or equal to 1
    else isPrimeUntil(n/2)
  }
  println(isPrime(7))  // Outputs: true
}


