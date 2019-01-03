package excercises

abstract class MyList[+T]  {

  def head: T
  def tail: MyList[T]
  def isEmpty: Boolean
  def add[E >: T](element: E): MyList[E]
  def printElement: String

  def map[B](transformer: MyTransformer[T, B]): MyList[B]
  def filter(filter: MyPredicate[T]): MyList[T]

  def concat[B >: T](el: MyList[B]): MyList[B]
  def flatMap[B](transformer: MyTransformer[T, MyList[B]]): MyList[B]

  override def toString: String = "[" + printElement + "]"

}
