package lectures

object Functions extends App {

  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }
  println(greeting("Daniele", 34))

  def factorial(n: Int): Int = {
    if(n <= 0) 1 else n * factorial(n - 1)
  }
  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if(n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(7))

  def prime(n: Int): Boolean = {
    def subprime(div: Int): Boolean = {
      if(div == 1) true
      else
        if (n % div == 0) false
        else subprime(div -1)
    }

    subprime(n / 2)
  }

  println("num: " + 7 + " is prime: " + prime(7))
  println("num: " + 10 + " is prime: " + prime(10))
  println("num: " + 10 * 2 + " is prime: " + prime(10 * 2))

}
