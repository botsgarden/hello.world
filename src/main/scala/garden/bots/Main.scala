package garden.bots

import scala.util.{Failure, Success}

// JSON
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._


object Main extends App {

  case class Human(val firstName: String, val lastName: String)

  println("👋 Hello 🌍 ⚠️")

  val bob = Human("Bob", "Morane")
  val jsonString: String = bob.asJson.toString

  println(jsonString)

  println(
    decode[Human](jsonString)
  )


}
