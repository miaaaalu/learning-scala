package lecture.part1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)       //println("by value: " + 90289449593000L)
    println("by value: " + x)       //println("by value: " + 90289449593000L)
  }

  def calledByName (x: => Long): Unit = {
    println("by name: " + x)        //println("by value: " + System.nanoTime())
    println("by name: " + x)        //println("by value: " + System.nanoTime())
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

// printFirst(infinite(), 34)
  printFirst(34, infinite())
}
