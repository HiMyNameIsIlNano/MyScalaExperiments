package lectures

import java.time.Year

object ObjectOrientationExample1 extends App {

  var meAsAuthor: Writer = new Writer("HiMy", "NameIsIlNano", 1984)
  var notMe: Writer = new Writer("HiMy", "NameIsIlGigante", 1988)
  var meBook: Novel = new Novel("HiMyBook", 2016, meAsAuthor)

  println(meBook.isWrittenBy(meAsAuthor))
  println(meAsAuthor.fullName())
  println(meBook.isWrittenBy(notMe))
  println(meBook.authorAge())
  private val aNewCopy: Novel = meBook.copy()
  println(aNewCopy.yearOfRelease)

  // Defined with var, the parameters are also converted to Object Fields. Without the var, they are just parameters and
  // cannot be accessed with the object.field annotation
  class Writer(val firstName: String, val surname: String, val year: Int) {

    def fullName(): String = firstName + " " + surname

  }

  class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {

    def authorAge(): Int = yearOfRelease - author.year
    def isWrittenBy(author: Writer): Boolean = this.author == author
    def copy(): Novel = new Novel(this.name, Year.now.getValue, this.author)

  }

}
