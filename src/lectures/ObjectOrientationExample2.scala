package lectures

object ObjectOrientationExample2 extends App {

  val counterFromZero: Counter = new Counter()
  val counterFromTen: Counter = new Counter(10)
  println(counterFromZero.getCounter())
  println(counterFromZero.incrementCounter.counterValue)
  println(counterFromZero.incrementCounter(10).counterValue)
  println(counterFromTen.decrementCounter(5).counterValue)

  // Defined with var, the parameters are also converted to Object Fields. Without the var, they are just parameters and
  // cannot be accessed with the object.field annotation
  class Counter(val counterValue: Int = 0) {

    def getCounter(): Int = counterValue

    def incrementCounter(): Counter = {
      println("incrementing")
      new Counter(counterValue + 1)
    }
    def incrementCounter(counterValue: Int): Counter = {
      if (counterValue <= 0) this
      else incrementCounter.incrementCounter(counterValue - 1)
    }

    def decrementCounter(): Counter = {
      println("decrementing")
      new Counter(counterValue - 1)
    }
    def decrementCounter(counterValue: Int): Counter = {
      if (counterValue <= 0) this
      else decrementCounter.decrementCounter(counterValue - 1)
    }

  }

}
