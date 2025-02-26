package Assignment15

//parent class
class Animal {
  def speak(): Unit=println("Animal is speaking")
}

//child class 1
class Dog extends Animal{
  override def speak(): Unit=println("Dog says:woof woof")
}
//child class 2
class Cat extends Animal{
  override def speak(): Unit = println("cat says: meow meow")
}

//covariant container
class CovariantContainer[+T](val item: T) {
  def get: T = item
}


//contravariance container
class contravariantContainer[-T] {
  def add(item: T): Unit = println(s"Added items: $item")
}

  @main def CvarinceAndContravariantExample(): Unit={
    println("______covariant Example__________")
  val dogContainer= new CovariantContainer[Dog](new Dog)
  val animalContainer:CovariantContainer[Animal]=dogContainer  //assign dog container to animal container is allowed
  animalContainer.get.speak()
  val catContainer=new CovariantContainer[Cat](new Cat)
    val animalContainer1:CovariantContainer[Animal]=catContainer  //assign cat container to animal container is allowed
  animalContainer1.get.speak()

    println("_____________contravariant Example____________")
    val animalContainerforWrite : contravariantContainer[Animal]=new contravariantContainer[Animal]
    val dogContainerforWrite : contravariantContainer[Dog]=animalContainerforWrite
    dogContainerforWrite.add(new Dog())
}



