package lectures

object Expressions extends App {

  // vals are immutable
  val a: Int = 10
  val b: Float = 10.2f

  val c = a + b
  println("type of c: " + c.getClass)

  var d: Int = 5
  d += 1
  println("d: " + d)

  var aVar: Int = 10

  val aWeirdVal = (aVar = 3)
  println("aWeirdVal: " + aWeirdVal)

  val aCodeBlock = {
    val y = 10
    val z = 5
    // The value of the Code Block is the result of the last expression in the block
    y < z
  }
  println("aCodeBlock: " + aCodeBlock)

}
