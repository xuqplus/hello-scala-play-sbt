package controllers

import javax.inject.{Inject, Singleton}
import play.api.Logger
import play.api.mvc.{BaseController, ControllerComponents}

@Singleton
class AController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  val logger0 = Logger(this.getClass)
  val logger1 = Logger("application")
  val logger2 = Logger("root")

  def loggers() = Action {
    logger0.trace("trace");
    logger0.debug("debug");
    logger0.info("info");
    logger0.warn("warn");
    logger0.error("error");

    logger1.trace("trace");
    logger1.debug("debug");
    logger1.info("info");
    logger1.warn("warn");
    logger1.error("error");

    logger2.trace("trace");
    logger2.debug("debug");
    logger2.info("info");
    logger2.warn("warn");
    logger2.error("error");

    Ok("loggers tested.")
  }

  def hello() = Action {
    Ok("hello, world.")
  }
}
