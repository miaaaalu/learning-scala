package lecture.part1basics
// prefer vals over vars
object ValuesVariablesTypes extends App {
  // VALUE ARE IMMUTABLE
  // THE TYPES OF VALUE ARE OPTIONAL
  val x: Int = 42
  println(x)

  //string
  val aString: String = "hello"

  //other
  val aBoolean: Boolean = false
  val aChar: Char = 'a'

  // numeric value
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 4613461345454545445L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES
  // VARIABLES ARE MUTABLE
  var aVariable: Int = 4

  aVariable = 5

}
