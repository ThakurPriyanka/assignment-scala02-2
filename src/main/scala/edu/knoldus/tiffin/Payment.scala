package edu.knoldus.tiffin

trait Payment {

  def extraCharge(): Double
  def totalCharge(): Double
}
