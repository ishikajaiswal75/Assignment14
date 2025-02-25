package Assignment14

class Typecasting {
  def castToString(value:Any):String={
//    value.toString match// yeh String return karega
    value match{
      case str:String=> s"it is a string:$str"
      case num:Int =>   s"it is a integer:$num"
      case dbl:Double=> s"it is double:$dbl"
      case bool:Boolean=>s"it is boolean:$bool"
      case _  =>"default"
     }
  }
}
object Typecasting extends App{
  val caster=new Typecasting()
  println(caster.castToString("hello"))
  println(caster.castToString(10))
  println(caster.castToString(99.99))
  println(caster.castToString(true))
  println(caster.castToString(List(1,2,3)))
}
