package excercises

trait EvenPredicate extends MyPredicate[Int] {

  override def myTest(value: Int): Boolean = value % 2 == 0

}
