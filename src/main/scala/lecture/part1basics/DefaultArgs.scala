package lecture.part1basics

object DefaultArgs extends App {
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(n = 4, acc = 2)
  println(fact10)
}

object Args2 extends App {
  def savePicture(format: String, width: Int, height: Int): Unit =
    println("saving picture")

}
