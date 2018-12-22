package lectures

object ValueVariableTypes extends App {

  // vals are immutable
  val aVal: Int = 10
  println("aVal: " + aVal)

  val aString: String = "A String"
  val aChar: Char = 'a'
  val anInt: Int = 100000 // 4 bytes
  val aShort: Short = 10000 // 2 bytes
  val aLong: Long = 100000 // 8 bytes
  val aFloat: Float = 10.0f
  val aDouble: Double = 10.0
  println("aString: " + aString)

  var aVar: Int = 10
  aVar = 12

}
