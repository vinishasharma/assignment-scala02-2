package edu.knoldus

class Payment {

  def calculateAmount(amount: Double, modeOfPayment:String): Double ={

    modeOfPayment match {
      case "Paytm" => amount + 0.2*amount
      case "Freecharge" => amount + 0.2*amount
      case "Net Banking" => amount + 5
      case "Card Payment" => amount + 1.5
      case "Cash" => amount
      case _ => 0
    }

  }

}
