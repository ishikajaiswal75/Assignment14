package Assignment16

enum Planet(val mass: Double,val radius: Double) {
  case Mercury extends Planet(3.30e23,2.4397e6)
  case venus extends Planet(4.87e24, 6.0518e6)
  case Earth extends Planet(5.97e24, 6.3710e6)
  case Mars extends Planet(6.42e23, 3.3895e6)
  case Jupiter extends Planet(1.90e27, 6.9911e7)
  case Saturn extends Planet(5.68e26, 5.8232e7)
  case Uranus extends Planet(8.68e25, 2.5362e7)
  case Neptune extends Planet(1.02e26, 2.4622e7)

}
@main def start(): Unit={
  val planet=Planet.Earth
  println(s"Planet: $planet")
  println(s"mass: ${planet.mass}kg")
  println(s"radius: ${planet.radius}meters")
}