package edu.knoldus

case class Gamer(diceRollCount: Int) extends Person {

  def determineDiceGameResult(): String = {

    def gameResultHelper(rollCount: Int): String = {
      val random = new scala.util.Random
      val diceResult = 1 + random.nextInt((6 - 1) + 1)
      if ((diceResult == 6 || diceResult == 1) && (rollCount < 3)) {
        gameResultHelper(rollCount - 1)
      }
      else if (rollCount == 0) {
        "Winner"
      }
      else {
        "Looser"
      }
    }
    gameResultHelper(diceRollCount)
  }

}
