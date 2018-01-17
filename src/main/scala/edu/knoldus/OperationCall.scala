package edu.knoldus

import org.apache.log4j.Logger

object OperationCall {

  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val payment = new Payment
    val amount1 = 2000
    val amount2 = 1000
    val totalAmount1 = payment.calculateAmount(amount1, "Net Banking")
    log.info(s"Final amount is: $totalAmount1\n")
    val totalAmount2 = payment.calculateAmount(amount2, "Cash")
    log.info(s"Final amount is: $totalAmount2\n")

    val gamer = new Gamer("Ramesh")
    val diceRollCount = 3
    val gameResult = gamer.determineDiceGameResult(diceRollCount)
    val classStrength = 50
    val trainer = new Trainer("Jaya")
    val attendance = trainer.returnAttendance(classStrength)
    val blogList = Map("java" -> 2, "scala" -> 4, "kafka" -> 3)
    val blogger = new Blogger(blogList)
    val favouriteTechnology = blogger.getFavouriteTechnology

    def showResponse(person: Person): String = {

      person match {
        case Gamer(name:String) => gameResult
        case Trainer(name:String) => attendance
        case Blogger(blogList: Map[String, Int]) => favouriteTechnology
      }

    }
    log.info(s"\nGamer response: ${showResponse(gamer)}")
    log.info(s"\nTrainer response: ${showResponse(trainer)}")
    log.info(s"\nBlogger response: ${showResponse(blogger)}")

  }

}

