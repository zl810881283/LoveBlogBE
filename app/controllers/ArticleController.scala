package controllers

import javax.inject.{Inject, Singleton}

import akka.actor.ActorSystem
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ArticleController @Inject()(cc: ControllerComponents, actorSystem: ActorSystem)(implicit exec: ExecutionContext) extends AbstractController(cc) {
  def get(id: Int) = Action.async {
    Future {
      Ok("get by id")
    }
  }

  def list = Action.async { implicit request =>
    Future {
      Ok("get by list")
    }
  }

  def post = Action.async { implicit request =>
    Future {
      Ok("post")
    }
  }

  def put(id: Int) = Action.async { implicit request =>
    Future {
      Ok("put")
    }
  }

  def patch(id: Int) = Action.async { implicit request =>
    Future {
      Ok("patch")
    }
  }

  def delete(id: Int) = Action.async { implicit request =>
    Future {
      Ok("delete")
    }
  }
}
