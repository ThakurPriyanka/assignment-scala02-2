package edu.knoldus.tiffin

class NetBanking(charges: Double) extends Payment {

  override def extraCharge(): Double = {
    5
  }

  override def totalCharge(): Double = {
    charges + extraCharge()
  }

}
