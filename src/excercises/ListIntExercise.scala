package excercises

object ListIntExercise extends App {

  val emptyList = new EMyList[Int]
  println(emptyList.isEmpty)
  //println(emptyList.head)

  val nonEmptyList = new AMyList[Int](30, emptyList)
  println(nonEmptyList.isEmpty)
  println(nonEmptyList.head)

  // 15 -> 10 -> 5
  val aNewList = new AMyList[Int](5, emptyList).add(10).add(15)
  println(aNewList.toString)
  println(aNewList.tail.head)

  val doubleTransformer: DoubleTransformer = new DoubleTransformer {}
  val doubleList = aNewList.map(doubleTransformer)
  println(doubleList.toString)

  val evenPredicate = new EvenPredicate {}
  val filteredList = aNewList.filter(evenPredicate)
  println(filteredList.toString)

  val flatMapTransformer: FlatMapTransformer = new FlatMapTransformer {}

  println("aNewList", aNewList.toString)
  println("nonEmptyList", nonEmptyList.toString)
  println("concatenated", aNewList concat nonEmptyList)

  println("flatMap", aNewList.flatMap(flatMapTransformer))
}
