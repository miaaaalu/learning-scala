package lecture.part1basics


object 
expressions extends App {
  val x = 1 + 2 //EXPRESSION
  println(x)
  println(2 + 3 * 4)
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 //aVariable = aVariable + 3
  println(aVariable)

  // Instructions (DO) vs Expressions (Value)

  // IF expression
  val aCondition = true
  val anotherCondition = if (aCondition) 5 else 3

  // side effects print(), whiles, reassigning
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2 ) "hello" else "goodbye"
  }
  println (aCodeBlock)

  // difference between "hello world" vs println("hello world")?  answer: string vs unit

  // 2. true
  val somevalue = {
    2 < 3
  }

  // 3.
  val someOtherValue = {
    if(somevalue) 239 else 986
    42
  }
  println(someOtherValue)
}

/*
+ : Addition Operator. Example: 5 + 3 results in 8.
- : Subtraction Operator. Example: 5 - 3 results in 2.
/ : Division Operator. Example: 8 / 2 results in 4.
* : Multiplication Operator. Example: 5 * 3 results in 15.
% : Modulus (Remainder) Operator. Example: 7 % 3 results in 1.
&&: Logical AND

| : Bitwise OR Operator
||: Logical OR

>> : Right Shift Operator
<< : Left Shift Operator
>>>: Unsigned Right Shift

== and !=: Native Equality and Inequality Operators
  a == b checks if a is equal to b.
  a != b checks if a is not equal to b.
>, <, >=, <=: Relational Operators

!: Logical NOT
^: Bitwise XOR


=== and !==: Equality and Inequality Operators
  a === b checks if a is equal to b.
  a !== b checks if a is not equal to b.

& : Bitwise AND Operator
*/