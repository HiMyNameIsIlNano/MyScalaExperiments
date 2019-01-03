package excercises

trait StringToIntTransformer extends MyTransformer[String, Int] {

  def transform(in: String): Int = {
    Integer.valueOf(in)
  }

}
