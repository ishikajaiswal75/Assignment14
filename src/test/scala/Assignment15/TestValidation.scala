package Assignment15

object TestValidation {
  def testGenericContainer():Unit= {
    println("=====Testing Generic Container=====")
    val stringContainer = new Container[String]()
    stringContainer.add("scala test")
    assert(stringContainer.get.contains("scala test"), "string test failed")

    val intContainer = new Container[Int]()
    intContainer.add(10)
    assert(intContainer.get.contains(10), "Int test failed")

    println("generic test passed:\n")
  }
   def testCovariantContainer(): Unit={
     println("=====Test covariant container=====")
     val dogContainer=new CovariantContainer[Dog](new Dog)
     val animalContainer : CovariantContainer[Animal]=dogContainer //covariant check
     assert(animalContainer.get.isInstanceOf[Dog],"covariance failed for dog")

     val catContainer=new CovariantContainer[Cat](new Cat)
     val animalContainer2:CovariantContainer[Animal]=catContainer
     assert(animalContainer2.get.isInstanceOf[Cat],"covariance failed for cat")

     println("covariant test passes\n")
   }

   def testcontravariantContainer(): Unit={
     println("======test contravariant container======")
     val animalContainer:contravariantContainer[Animal]=new contravariantContainer[Animal]
     val dogContainer:contravariantContainer[Dog]=animalContainer   //contravariance check
     dogContainer.add(new Dog())
     println("contravariant test passed.\n")
   }

   def testUpperbound(): Unit={
     println("=====Testing upperbound======")
     val dog=new Dogs()
     val cat=new Cats()
     printAnimalInfo(dog)
     printAnimalInfo(cat)
     println("upper bound test passed.\n")
   }

   def testLowerbound(): Unit={
     println("====Testing Lower Bound=====")
     val animalList:List[Animal]=List(new Animal())
     val updatedList=addDogToList(new Dog(),animalList)
     assert(updatedList.exists(_.isInstanceOf[Dog]),"lower bound failed" )

   }

   def main(args:Array[String]):Unit={
   try {
     testGenericContainer()
     testCovariantContainer()
     testcontravariantContainer()
     testUpperbound()
     testLowerbound()
     println("all validation test passed sucessfully")
   }
     catch
       case e:AssertionError=>
         println(s"test failed:${e.getMessage}")
   }
}





