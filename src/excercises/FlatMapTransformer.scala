package excercises

trait FlatMapTransformer extends MyTransformer[Int, MyList[Int]] {

  def transform(in: Int): MyList[Int] = {
    new AMyList[Int](in, new AMyList[Int](in + 1, new EMyList[Int]))
  }

}
