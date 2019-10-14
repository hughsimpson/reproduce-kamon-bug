package reproduce_bug

import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{Await, Future, Promise}

//import akka.http.scaladsl.server.{HttpApp, Route}
//import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport
import kamon.Kamon




object Main extends App {
//  Kamon.registerModule("prometheus", metricsReporter)
//  Sentry.init(DefaultServerConfig.sentryHost)
  val p = Promise[String]()
  Kamon.init()
  println("OK!")
  Await.result(p.future, Inf)
//  Await.result(new Service().complete, Inf)
}




//class Service extends HttpApp with FailFastCirceSupport {
//  lazy val routes: Route = (get & path("hi")) {
//    complete("ho!\n")
//  }
//  Kamon.loadModules()
//  startServer("0.0.0.0", 8080)
//
//  def complete: Future[Unit] = Future successful ()
//}
