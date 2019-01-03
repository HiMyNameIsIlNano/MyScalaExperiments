package excercises

trait DoubleTransformer extends MyTransformer[Int, Int] {

  def transform(in: Int): Int = {
    in * 2
  }

}
