package controllers

import javax.inject._

import com.typesafe.scalalogging.LazyLogging
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}


/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() (
  implicit ec: ExecutionContext
) extends Controller with LazyLogging {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    logger.info("Logging")
    Future {
      logger.info("Logging in the Future!")
    }
    Ok(views.html.index("Your new application is ready."))
  }

}
