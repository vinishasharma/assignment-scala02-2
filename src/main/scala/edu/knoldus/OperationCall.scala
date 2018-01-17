package edu.knoldus

import org.apache.log4j.Logger

object OperationCall {

  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)

    val payment = new Payment
    val amount1 = 2000
    val amount2 = 1000
    val result1 = payment.calculateAmount(amount1, "Net Banking")
    log.info(s"Final amount is: $result1\n")
    val result2 = payment.calculateAmount(amount2, "Cash")
    log.info(s"Final amount is: $result2\n")

    val gamer = new Gamer(3)
    val gameResult = gamer.determineDiceGameResult()
    val classStrength = 50
    val trainer = new Trainer(classStrength)
    val attendance = trainer.returnAttendance()
    val blogs = Map("java" -> 2, "scala" -> 4, "kafka" -> 3)
    val blogger = new Blogger(blogs)
    val favouriteTechnology = blogger.getFavouriteTechnology
    def showResponse(person: Person): String = {
      person match {
        case Gamer(diceRollCount: Int) => gameResult
        case Trainer(classStrength: Int) => attendance
        case Blogger(blogList: Map[String, Int]) => favouriteTechnology
      }
    }
    log.info(s"\n gamer response: ${showResponse(gamer)}")
    log.info(s"\n trainer response: ${showResponse(trainer)}")
    log.info(s"\n blogger response: ${showResponse(blogger)}")
  }

}

