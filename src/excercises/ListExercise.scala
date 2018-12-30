package excercises

object ListExercise extends App {

  val emptyList = new EMyList
  println(emptyList.isEmpty)
  //println(emptyList.head)

  val nonEmptyList = new AMyList(5, emptyList)
  println(nonEmptyList.isEmpty)
  println(nonEmptyList.head)

  // 15 -> 10 -> 5
  val aNewList = nonEmptyList.add(10).add(15)
  println(aNewList.toString)
  println(aNewList.tail.head)

}
