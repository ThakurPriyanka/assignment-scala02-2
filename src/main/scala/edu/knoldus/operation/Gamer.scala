package edu.knoldus.operation

import scala.util.Random

class Gamer extends Person {

  def rollTheDice(turn: Int): Int = {
    Random.nextInt(6)
  }

  def play(): Int = {
    val turn = 3
    rollTheDice(turn) match {
      case 1 | 6 if turn <= 3 =>  print(s"value \n ${rollTheDice(turn - 1)}") ;0
      case 1 | 6 if turn == 0 => 0
      case 1 | 6 if turn > 0 => -1
      case _ => print(_); -1
    }
  }
}
