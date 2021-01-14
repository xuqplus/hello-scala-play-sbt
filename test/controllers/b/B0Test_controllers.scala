package controllers.b

import java.util.concurrent.TimeUnit

import akka.util.Timeout
import controllers.BController
import org.scalatestplus.play.PlaySpec
import play.api.Logger
import play.api.mvc.{Result, Results}
import play.api.test.{FakeRequest, Helpers}

import scala.concurrent.Future

class B0Test_controllers extends PlaySpec with Results {
  val log = Logger(getClass)

  /**
   * right click and choose debug this class in intellij idea if you need to debug
   * breakpoints won't take effect when running 'sbt test/testOnly' in sbt shell
   */
  "a test" should {
    "1" in {
      val controller = new BController(Helpers.stubControllerComponents())
      val future: Future[Result] = controller.car().apply(FakeRequest())
      val result = Helpers.contentAsString(future)(Timeout(2, TimeUnit.SECONDS))
      println("####")
      log.warn(result)
      println("####")

      assert(result contains ("byd"))
    }

    "2" in {
      assert(false)
    }
  }
}
