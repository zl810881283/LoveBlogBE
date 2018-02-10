package controllers

import javax.inject._

import play.api.Logger
import play.api.mvc._
import play.api.libs.json.Json

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request =>
    val data = Seq(Person(1,"zl","test"),Person(1,"zl","test"),Person(1,"zl","test"),Person(1,"zl","test"))
    Ok(Json.toJson(data)(Json.format[Person]))
  }
}

case class Person(id:Int,name:String,desc:String)
