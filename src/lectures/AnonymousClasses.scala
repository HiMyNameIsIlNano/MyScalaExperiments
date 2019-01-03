package lectures

object AnonymousClasses extends App {

  abstract class Person(name: String) {
    def SayHi(message: String) = println(s"Hi my name is ${name} and I say ${message}")
  }

  val jim = new Person("Jim") {
    override def SayHi(message: String) = println(s"Hi my name is Jim and I say Hello!")
  }

  println(jim.getClass)

}
