package excercises

class AMyList(val e: Int, val t: MyList) extends MyList {

  override def head: Int = e
  override def tail: MyList = t
  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = {
    new AMyList(element, this)
  }

  override def printElement: String = {
    if(t.isEmpty) "" + this.e
    else this.e + ", " + t.printElement
  }

}
