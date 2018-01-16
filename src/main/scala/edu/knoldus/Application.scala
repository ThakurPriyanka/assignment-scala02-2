package edu.knoldus

import edu.knoldus.operation.{Gamer, Person, Trainer}

object Application {

  def main(args: Array[String]): Unit = {
    val typeOfPerson = "trainer"
    val initialMap = Map("Scala" -> 2, "Java" -> 5, "Kafka" -> 6)
     typeOfPerson.toLowerCase match {
      case "gamer" => {
                      val personObject =  new Gamer
                     val result =  personObject.play()
                      if( result == 0)
                      {
                        print("Winner")
                      }
                      else {
                        print("Looser")
                      }
                }
      case "trainer" => {
        val personObject = new Trainer
       print( s"Attendence: ${personObject.getAttendence()}")
      }
      }

    }
}
