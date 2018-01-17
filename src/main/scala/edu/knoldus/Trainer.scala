package edu.knoldus

case class Trainer(classStrength: Int) extends Person {

  def returnAttendance(): String = {
    val random = new scala.util.Random
    s"attendance is ${1 + random.nextInt((50 - 1) + 1)}"
  }

}
