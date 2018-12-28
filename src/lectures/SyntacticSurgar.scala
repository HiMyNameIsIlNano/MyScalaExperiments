package lectures

object SyntacticSurgar extends App {

  val mary: Person = new Person("Mary", 30, "The Sword in The Stone")
  val newMary: Person = +mary
  println(newMary.age)
  val newMaryRocks: Person = mary.+("Rocks!")
  mary learns "Java"
  mary learnsScala;
  mary.apply(2)
  mary(4)

  class Person(val name: String, val age: Int = 0, favoriteMovie: String) {
    def unary_+ : Person = new Person(name, age + 1, favoriteMovie)
    def +(nickName: String): Person = new Person(s"$this.name ($nickName)", age, favoriteMovie)
    def learns(subject: String): Unit = println(s"${this.name} learns $subject")
    def learnsScala(): Unit = this learns "Scala"
    def apply(n: Int): Unit = println(s"${this.name} watched $favoriteMovie $n times")
  }
}
