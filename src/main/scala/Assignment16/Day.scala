package Assignment16

enum Day {
  case Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
@main def run(): Unit={
  val today= Day.Monday
  println(s"today is : $today")
}