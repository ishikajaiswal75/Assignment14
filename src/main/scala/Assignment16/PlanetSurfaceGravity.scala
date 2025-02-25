package Assignment16

enum PlanetSurfaceGravity(val mass: Double,val radius: Double) {
  case Mercury extends PlanetSurfaceGravity(3.30e23, 2.4397e6)
  case Venus extends PlanetSurfaceGravity(4.87e24, 6.0518e6)
  case Earth extends PlanetSurfaceGravity(5.97e24, 6.3710e6)
  case Mars extends PlanetSurfaceGravity(6.42e23, 3.3895e6)

  //method to calculate surface gravity
  def surfaceGravity: Double={
    val G = 6.67430e-11 // Gravitational constant
    G*mass/(radius*radius)

  }
}
@main def runs(): Unit={
  val planet=PlanetSurfaceGravity.Venus
  println(s"surface gravity of ${planet}: ${planet.surfaceGravity}m/s²")
}