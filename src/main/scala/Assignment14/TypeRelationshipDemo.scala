package Assignment14

object TypeRelationshipDemo extends App{
  //value types(AnyVal)
  val num: Int=100
  val price: Double=99.99
  val isAvail:Boolean=true

  //Reference types(AnyRef)
  val name:String="Ishika"
  val items:List[String]=List("shirt","shoes","Bag")

  //store in Any type
  val anything1:Any=num
  val anything2:Any=price
  val anything3:Any=isAvail
  val anything4:Any=name
  val anything5:Any=items

  println(anything1)
  println(anything2)
  println(anything3)
  println(anything4)
  println(anything5)
}
