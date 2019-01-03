package excercises

trait MyTransformer[-A, B] {

  def transform(in: A): B

}
