package controllers
import models.GameCard
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.collection.mutable.ListBuffer
import play.api._
import play.api.mvc._
import views.html


class Application extends Controller {



  def index = Action {
    Ok(views.html.index("ITS WORKING."))
  }

  def Homepage = Action {
    Ok(views.html.Homepage("Game-Codez-Homepage",GameCard.cardsList))

  }
  def GameFill(gameID: Int,gameCard: GameCard) = Action {
    Ok(views.html.GameFill("Game-Codez-Homepage",gameID))
  }

  def GamePage = Action {
    Ok(views.html.GamePage("Game-Codez-Homepage"))
  }

  def LoginPage = Action {
    Ok(views.html.LoginPage("Game-Codez-Homepage"))
  }

  def Fallout4Page = Action {
    Ok(views.html.Fallout4Page("Game-Codez-Homepage"))
  }
  def MembersPage = Action {
    Ok(views.html.MembersPage("Game-Codez-Homepage"))
  }

}