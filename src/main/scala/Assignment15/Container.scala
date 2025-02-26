package Assignment15

class Container [T] {
  private var item: Option[T]=None

  //method to add item
  def add(newItem:T):Unit= {
    item = Some(newItem)
    println(s"item added: $newItem")
  }
    //method to retreive the items
    def get: Option[T]={
      println(s"Retreiving item: $item")
      item

    }
  }
@main def runContainerEx():Unit={
  println("exmple 1: Container with string")
  val stringContainer=new Container[String]()
  stringContainer.add("Hello,scala")
  println(stringContainer.get.get)
  
  println("\n example 2:container with Int")
  val intContainer=new Container[Int]
  intContainer.add(100)
  println(intContainer.get.get)
}
