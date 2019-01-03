package excercises

trait MyPredicate[-T] {

  def myTest(value: T): Boolean

}
