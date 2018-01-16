package edu.knoldus.tiffin

object TiffinService {

  def main(args: Array[String]): Unit = {

    val paymentMethod = "paytm"

    val amount = 100
    val tiffinPayment: Payment = paymentMethod.toLowerCase match {
      case "paytm" =>  new Paytm(amount)
      case "freecharges" => new FreeCharge(amount)
      case "netbanking" => new NetBanking(amount)
      case "creditcard" => new CreditCard(amount)
    }

   print( s"${tiffinPayment.totalCharge()}")
  }


}
