package Assignment16

enum Day {

    case Monday, Tuesday, Wednesday, Thursday, Friday,Saturday
  }


enum Planet(val mass: Double, val radius: Double) {
  case Mercury extends Planet(3.30e23, 2.4397e6)
  case Venus extends Planet(4.87e24, 6.0518e6)
  case Earth extends Planet(5.97e24, 6.3710e6)
  case Mars extends Planet(6.42e23, 3.3895e6)
  case Jupiter extends Planet(1.90e27, 6.9911e7)
  case Saturn extends Planet(5.68e26, 5.8232e7)
  case Uranus extends Planet(8.68e25, 2.5362e7)
  case Neptune extends Planet(1.02e26, 2.4622e7)

}
enum PlanetSurfaceGravity(val mass: Double,val radius: Double) {
  case Mercury extends PlanetSurfaceGravity(3.30e23, 2.4397e6)
  case Venus extends PlanetSurfaceGravity(4.87e24, 6.0518e6)
  case Earth extends PlanetSurfaceGravity(5.97e24, 6.3710e6)
  case Mars extends PlanetSurfaceGravity(6.42e23, 3.3895e6)

    //method to calculate surface gravity

    def surfaceGravity: Double = {
      val G = 6.67430e-11 // Gravitational constant
      G * mass / (radius * radius)
    }
    }

//main function
object Validation {
  @main def run(): Unit = {
    println("-----Day Enum Check-----")
    val today = Day.Monday
    println(s"today is ${today}")

    //pattern matching
    today match {
      case Day.Saturday => println("Weekend vibes")
      case _ => println("Workday")
    }
    println("\n-----Planet Enum check-----")
    val planet = Planet.Earth
    println(s"Planet: ${planet}")
    println(s"mass: ${planet.mass}kg")
    println(s"radius: ${planet.radius}meters")

    println("\n--- Planet Surface Gravity Check ---")
    val surfacePlanet = PlanetSurfaceGravity.Venus
    println(s"surface gravity of ${surfacePlanet}: ${surfacePlanet.surfaceGravity}m/s²")

    println("\n----Running Unit Tests----")
    runTest()
  }

  //unit test for all enum and methods
  def runTest(): Unit = {
    // Test 1: Day Enum Value Check
    assert(Day.Monday.toString == "Monday", "Test failed:it is not monday")
    println("Test 1 Passed: Day Enum is right")

    //Test 2: Pattern Matching on Day Enum
    def describeDay(day: Day): String =
      day match {
        case Day.Saturday => "Weekend"
        case _ => "Weekday"
      }

    assert(describeDay(Day.Tuesday) == "Weekday", "Test failed: Tuesday is weekday")
    assert(describeDay(Day.Saturday) == "Weekend", "Test failed: Saturday is weekend")
    println("Test 2 Passed: Day Enum Pattern matched")

    //Test 3: Planet Enum Value check
    assert(Planet.Earth.mass == 5.97e24, "Test Failed : mass of Earth is wrong")
    assert(Planet.Mars.radius == 3.3895e6, "Test failed : radius of mars is wrong")
    println("Test 3 Passed : Planet values is correct")

    //Test 4 Surface Gravity Method Check
    val venusGravity = PlanetSurfaceGravity.Venus.surfaceGravity
    val expectedVenusGravity = 6.67430e-11 * 4.87e24 / (6.0518e6 * 6.0518e6)
    assert(Math.abs(venusGravity - expectedVenusGravity) < 1e-10, "Test failed : venus gravity is wrong")
    println("Test 4 Passed: surface gravity method worked properly")

    println("\n All Tests Passed successfully")
  }
}