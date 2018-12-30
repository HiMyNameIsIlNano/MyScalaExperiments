package excercises

abstract class MyList  {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElement: String
  override def toString: String = "[" + printElement + "]"

}
