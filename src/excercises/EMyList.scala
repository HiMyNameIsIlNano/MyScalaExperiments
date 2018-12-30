package excercises

class EMyList extends MyList {

  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new AMyList(element, new EMyList)

  override def printElement: String = ""

}
