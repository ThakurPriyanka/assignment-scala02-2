package edu.knoldus.tiffin

class CreditCard (charges: Double) extends Payment {

  override def extraCharge(): Double = {
    1.5
  }

  override def totalCharge(): Double = {
    charges + extraCharge()
  }

}
