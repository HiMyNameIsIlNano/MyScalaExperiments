package excercises

// The Nothing Type is a proper substitute for AnyType
class EMyList[+T] extends MyList[Nothing] {

  override def head: Nothing = throw new NoSuchElementException

  override def tail: MyList[Nothing] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[C >: Nothing](element: C): MyList[C] = new AMyList(element, new EMyList)

  override def printElement: String = ""

  override def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = new EMyList

  override def concat[B >: Nothing](el: MyList[B]): MyList[B] = el

  override def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = new EMyList

  override def filter(filter: MyPredicate[Nothing]): MyList[Nothing] = new EMyList
}
