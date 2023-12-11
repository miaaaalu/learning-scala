package lecture.part2oop.MethodNotations

//判断某个电影是否是这个人物的最喜欢的电影
object MethodNotations extends App {

  // 定义对象和相关属性
  class Person (val name: String, favoriteMovie: String) {

    // 定义方法：判断这部电影是否是这个人喜欢的电影
    def likes(movie: String): Boolean = movie == favoriteMovie
  }

  // 创建一个实例Mary，根据Person这个模板来创建
  val mary = new Person("Mary", "Inception")

  // 调用方法，并执行
  println(mary.likes("Inception"))

  // 调用方法，并执行
  println(mary likes "Inception")
}

