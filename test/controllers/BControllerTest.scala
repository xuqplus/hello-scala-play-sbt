package controllers

import org.scalatestplus.play.PlaySpec
import play.api.Logger

class BControllerTest extends PlaySpec {
  val log = Logger(getClass)

  println("hello play test plus")
  log.warn("hello play test plus")

  "Hello world" must endWith("world")
  "Hello world" must endWith("word")
}
