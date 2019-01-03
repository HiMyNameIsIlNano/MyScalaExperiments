package excercises

object ListStringExercise extends App {

  val emptyList = new EMyList[String]
  println(emptyList.isEmpty)
  //println(emptyList.head)

  val nonEmptyList = new AMyList[String]("first", emptyList)
  println(nonEmptyList.isEmpty)
  println(nonEmptyList.head)

  // 15 -> 10 -> 5
  val aNewList = nonEmptyList.add("second").add("third")
  println(aNewList.toString)
  println(aNewList.tail.head)

}
