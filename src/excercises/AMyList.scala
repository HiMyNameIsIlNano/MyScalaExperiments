package excercises

class AMyList[+T](val e: T, val t: MyList[T]) extends MyList[T] {

  override def head: T = e
  override def tail: MyList[T] = t
  override def isEmpty: Boolean = false

  override def add[C >: T](element: C): MyList[C] = {
    new AMyList(element, this)
  }

  override def printElement: String = {
    if(t.isEmpty) "" + e
    else e + ", " + t.printElement
  }

  override def filter(filter: MyPredicate[T]): MyList[T] = {
    if(filter.myTest(head)) new AMyList[T](head, tail.filter(filter))
    else tail.filter(filter)
  }

  override def map[B](transformer: MyTransformer[T, B]): MyList[B] = {
    new AMyList(transformer.transform(head), tail.map(transformer))
  }

  override def concat[B >: T](el: MyList[B]): MyList[B] = {
    /*if (this.tail.isEmpty) new AMyList[B](this.head, el)
    else new AMyList[B](this.head, this.tail.concat(el))*/
    new AMyList[B](head, tail concat el)
  }

  override def flatMap[B](transformer: MyTransformer[T, MyList[B]]): MyList[B] = {
    transformer.transform(head) concat tail.flatMap(transformer)
  }
}
