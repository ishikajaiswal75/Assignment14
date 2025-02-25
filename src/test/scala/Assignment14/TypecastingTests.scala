package Assignment14

class TypecastingTests {

    def castToString(value: Any): String = {
      //    value.toString match// yeh String return karega
      value match {
        case str: String => s"it is a string:$str"
        case num: Int => s"it is a integer:$num"
        case dbl: Double => s"it is double:$dbl"
        case bool: Boolean => s"it is boolean:$bool"
        case _ => "default"
      }
    }
  }

  object TypecastingTest extends App {
    val caster = new TypecastingTests()

    assert(caster.castToString("hello") == "it is a string:hello")
    assert((caster.castToString(10) == "it is a integer:10"))
    assert(caster.castToString(99.99) == "it is double:99.99")
    assert(caster.castToString(true) == "it is boolean:true")

    assert(caster.castToString(List(1, 2, 3)) == "default")
    println("All test passed successfully")
  }


