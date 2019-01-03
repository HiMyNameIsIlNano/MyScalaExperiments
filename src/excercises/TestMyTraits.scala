package excercises

object TestMyTraits extends App {

  val evenPredicate = new EvenPredicate {}
  println(evenPredicate.myTest(3))
  println(evenPredicate.myTest(2))

  val str2Int = new StringToIntTransformer {}
  val result = str2Int.transform("110")
  println(result.getClass)

}
