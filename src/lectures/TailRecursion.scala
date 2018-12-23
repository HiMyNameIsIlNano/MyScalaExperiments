package lectures

import scala.annotation.tailrec

object TailRecursion extends App {

  def concatenate(aCounter: Int, aString: String): String = {
    @tailrec
    def concatHelper (aCounter: Int, aString: String, aResult: String): String = {
      if (aCounter == 0) return aResult
      else concatHelper(aCounter -1, aString, aString + "" + aResult)
    }

    concatHelper(aCounter, aString, "")
  }
  println(concatenate(3, "Hello"))

  def prime(n: Int): Boolean = {
    @tailrec
    def subPrime(div: Int, isPrime: Boolean): Boolean = {
      if (!isPrime) false
      else if (div == 1) isPrime
      else subPrime(div - 1, n % div != 0 && isPrime)
    }

    subPrime(n/2, true)
  }
  println(prime(7))
  println(prime(10))

  def fibonacci(n: Int): Int = {
    def fibHelper(num: Int, fibN: Int, tempSum: Int): Int = {
      if(num >= n) fibN
      else fibHelper(num + 1, fibN + tempSum, fibN)
    }

    if(n <= 2) 1
    else fibHelper(2, 1, 1)
  }
  println(fibonacci(7))
  println(fibonacci(8))

}
