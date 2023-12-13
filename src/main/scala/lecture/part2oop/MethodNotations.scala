package lecture.part2oop.MethodNotations

//判断某个电影是否是这个人物的最喜欢的电影
object MethodNotations extends App {

  // 定义对象和相关属性
  class Person (val name: String, favoriteMovie: String) {
    /** 定义方法
    * 方法 1：判断这部电影是否是这个人喜欢的电影
    * 方法 2：检查谁和谁在一起玩.
     * @person      参数person，数据类型是Person，即这个方法接受一个Person类型的对象作为输入参数。
     * @this.name   调用此方法实例的名字
     * @person.name 传入参数里实例的名字
   */
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  /** 创建一个实例 Mary
   * 根据 Person 这个模板来创建
   * 调用方法，并执行, 使用点（.）调用
   * 调用方法，并执行, 使用空格调用（中缀表示法）
   */
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")

  /** 创建一个实例 Tom
   * 根据 Person 这个模板来创建
 */
  val tom = new Person("Tom", "Fight Club")

  println(mary.hangOutWith(tom))
  println(tom.hangOutWith(mary))

  val x = -1
  val y = 1.unary_-

  println(x)
  println(y)
}

