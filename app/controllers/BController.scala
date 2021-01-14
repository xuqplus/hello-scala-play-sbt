package controllers

import domain.{Car, User}
import javax.inject.{Inject, Singleton}
import play.api.Logger
import play.api.mvc.{BaseController, ControllerComponents}

@Singleton
class BController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  val log = Logger(this.getClass)

  def logger() = Action {
    log.trace("trace");
    log.debug("debug");
    log.info("info");
    log.warn("warn");
    log.error("error");
    Ok("lombok logger tested.")
  }

  //
  def user() = Action {
    val user = new User(7, "xqq")
    Ok(user.toString)
  }

  /**
   * @return
   */
  def car() = Action {
    val car = Car(7, "byd")
    Ok(car.toString)
  }

  // todo, process request parameters
  def processPost() = Action {
    Ok("ok")
  }
}
