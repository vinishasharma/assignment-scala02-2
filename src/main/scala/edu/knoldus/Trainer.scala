package edu.knoldus

case class Trainer(name: String) extends Person {

  def returnAttendance(classStrength: Int): String = {

    val random = new scala.util.Random
    s"attendance submitted to trainer $name is ${1 + random.nextInt((50 - 1) + 1)}"

  }

}
