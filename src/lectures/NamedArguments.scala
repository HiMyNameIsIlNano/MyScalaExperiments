package lectures

object NamedArguments extends App {

  def aFunction(num: Long = 1, value: String = "default"): Unit = {
    println("num: " + num + ", value: " + value)
  }

  aFunction()
  // This one does not even compile as the first parameter is a Long number
  // aFunction("not_default")
  aFunction(value = "not_default", num = 20)

}
