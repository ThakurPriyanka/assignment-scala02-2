package edu.knoldus.operation

import scala.util.Random

class Trainer extends Person {

  def getAttendence(): Int = {
    Random.nextInt(50)
  }

}
