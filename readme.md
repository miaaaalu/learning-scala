# Tail Recursion 尾递归

## 数字相乘
```scala 
object tail_recursion extends App {
  def tail_recursion(n: Int): BigInt = {
    @tailrec
    def facthelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else facthelper(x - 1, x * accumulator)

    facthelper(n,1)
  }
  println(tail_recursion(5))
}
```
x = 5, accumulator = 1
When x = 5, 
    x           = x - 1           = 5 - 1 = 4,  
    accumulator = x * accumulator = 5 * 1 = 5
When x = 4,
    x           = x - 1           = 4 - 1 = 3,  
    accumulator = x * accumulator = 4 * 5 = 20
When x = 3,
    x           = x - 1           = 3 - 1 = 2,  
    accumulator = x * accumulator = 3 * 20 = 60
When x = 2,
    x           = x - 1           = 2 - 1 = 1,  
    accumulator = x * accumulator = 2 * 60 = 120
When x = 1, 
    x = accumulator = 120

## 字符串相加
```scala 
object tail_string_recursion extends App {
  def tail_string_recursion(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else tail_string_recursion(aString, n-1, aString + " " + accumulator)
  }
  println(tail_string_recursion("hello", 3, " "))
}
```
aString = "hello", x = 3, accumulator = " "
When x = 3,
            x           = x - 1                       = 3 - 1 = 2,  
            aString     = aString                     = hello
            accumulator = aString + " " + accumulator = hello + " " + " " = hello

When x = 2,
x           = x - 1           = 2 - 1 = 1,  
aString     = aString         = hello                  
accumulator = aString + " " + accumulator = hello + " " + hello = hello hello

When x = 1,
x           = x - 1           = 0
aString     = aString         = hello                  
accumulator = aString + " " + accumulator = hello + " " + hello hello= hello hello hello

//3. A Fibonacci function
//  f(1) = 1
//  f(2) = 1
//  f(n) = f(n - 1) + f(n - 2）
//7+6+5+4+3+2

## a Fibonacci Function
```scala
object aFibonacciFunction extends App{
    def aFibonacciFunction(n:Int): Int = {
        if (n <= 2) 1
        else aFibonacciFunction(n - 1) + aFibonacciFunction(n - 2)
    }
    println(aFibonacciFunction(8))
}
```
1. F(1) = 1
2. F(2) = 1
3. F(3) = F(2) + F(1) = 1 + 1 = 2
4. F(4) = F(3) + F(2) = 2 + 1 = 3
5. F(5) = F(4) + F(3) = 3 + 2 = 5
6. F(6) = F(5) + F(4) = 5 + 3 = 8
7. F(7) = F(6) + F(5) = 8 + 5 = 13
8. F(8) = F(7) + F(6) = 13 + 8 = 21

## String operation 
```scala
object StringOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  
}
```
1. charAt:

* Purpose: Retrieve a single character from a string.
* Parameter: Takes a single argument, which is the index of the character you want to retrieve.
* Example: In your code, str.charAt(2) returns the character at index 2 in the string str, which is 'l'.

2. substring:
   
* Purpose: Retrieve a sequence of characters (substring) from a string. 
* Method Signature: substring(beginIndex: Int, endIndex: Int): String 
* Parameters:
  * beginIndex: The start index, inclusive. 
  * endIndex: The end index, exclusive. 
* Example: In your code, str.substring(7, 11) returns the substring that starts at index 7 and ends just before index 11, resulting in the string "I am".