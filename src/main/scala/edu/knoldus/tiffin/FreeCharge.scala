package edu.knoldus.tiffin

class FreeCharge(val charges: Double) extends Payment {

  override def extraCharge(): Double = {
    charges * 0.02
  }

  override def totalCharge(): Double = {
    charges + extraCharge()
  }

}

