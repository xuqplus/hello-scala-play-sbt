package controllers.b

import java.util.concurrent.TimeUnit

import akka.util.{ByteString, Timeout}
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.Logger
import play.api.http.Writeable
import play.api.mvc.Result
import play.api.test.Helpers.{GET, POST}
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

class B1Test_applications extends PlaySpec with GuiceOneAppPerSuite {
  val log = Logger(getClass)

  /**
   * val application: Application = new GuiceApplicationBuilder()
   * .configure("some.configuration" -> "value")
   * .build()
   * log.warn(application.configuration.toString)
   */
  /**
   * val application = new GuiceApplicationBuilder()
   * .in(Environment(new File("./app"), getClass.getClassLoader, Mode.Test))
   * .build()
   */
  /**
   * override def fakeApplication(): Application = super.fakeApplication()
   */
  // ways to initialize/override test application are above

  "this test" should {
    "1" in {
      val request = FakeRequest(GET, "/")
      // todo, what is a Writeable
      val writeable = new Writeable[Object](_ => ByteString.apply("any"), Option("any"))
      val Some(future: Future[Result]) = Helpers.route(app, request)(writeable)
      val result = Helpers.contentAsString(future)(Timeout(2, TimeUnit.SECONDS))
      log.warn(result)
      result mustNot be(empty)
    }
    "2" in {
      val request = FakeRequest(POST, "/b/processPost")
      // todo, what is a Writeable
      val writeable = new Writeable[Object](_ => ByteString.apply("any"), Option("any"))
      val Some(future: Future[Result]) = Helpers.route(app, request)(writeable)
      val result = Helpers.contentAsString(future)(Timeout(2, TimeUnit.SECONDS))
      log.warn(result)
      result must be("ok")
    }
  }
}
