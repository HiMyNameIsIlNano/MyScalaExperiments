package lectures

object Generics extends App{

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class InvariantList[T]
  class CovariantList[+T]
  class ContravariantList[-T]
  class WhateverList[T <: Animal](animal: T)

  // Invariance
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // Covariance
  val covariantList: CovariantList[Animal] = new CovariantList[Cat]

  // Contravariance
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  // Bounded Generics
  val whateverList: WhateverList[Dog] = new WhateverList(new Dog)

}
