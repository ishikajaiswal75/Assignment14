package Assignment15

class Animal1 {
  def speak(): Unit = println("Animal is speaking")
}

//child class 1
class Dogs extends Animal1 {
  override def speak(): Unit = println("Dog says:woof woof")
}

//child class 2
class Cats extends Animal1 {
  override def speak(): Unit = println("cat says: meow meow")
}
//upper bound Example(for read)
def printAnimalInfo[T<:Animal1](animal:T): Unit = {
  println("\nupper bound Example")
  animal.speak()
}
//lower bound
def addDogToList[T>:Dog](animal: T,list:List[T]):List[T]={
  println("\n lower bound example")
  println(s"added : $animal")
  list:+animal
}

//main method
@main def UpperLowerBoundEx(): Unit={
  //upper bound example
  val dog=new Dogs()
  val cat=new Cats()
  printAnimalInfo(dog)
  printAnimalInfo(cat)

  // lower bound
  val animalList:List[Animal]=List(new Animal())
  val updatedList=addDogToList(new Dog(),animalList)

  println("\nupdated list after adding Dog")
  updatedList.foreach(_.speak())
}