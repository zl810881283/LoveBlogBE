package models

import java.sql.Timestamp
import play.api.libs.json.Json


case class Article(id:Long, title: String, headPic: String, mdContent: String, htmlContent: String, createAt: Timestamp, updateAt: Timestamp)

object Article {
  implicit val articleFormat = Json.format[Article]
}

