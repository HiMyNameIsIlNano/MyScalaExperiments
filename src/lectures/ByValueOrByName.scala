package lectures

object ByValueOrByName extends App {

  def aFunctionByValue(value: Long): Unit = {
    println("by Value: " + value) // The value is passed as constant
    println("by Value: " + value)
  }

  def aFunctionByName(value: => Long): Unit = {
    println("by Name: " + value) // The function is evaluated every time it is used
    println("by Name: " + value)
  }

  aFunctionByValue(System.nanoTime())
  aFunctionByName(System.nanoTime())

}
