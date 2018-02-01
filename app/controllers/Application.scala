package controllers
import scala.collection.mutable.ListBuffer
import play.api._
import play.api.mvc._


class Application extends Controller {

  var gameInfoList = new ListBuffer[String]()



  def index = Action {
    Ok(views.html.index("ITS WORKING."))
  }

  def Homepage = Action {
    Ok(views.html.Homepage("Game-Codez-Homepage"))
  }

  def GamePage = Action {
    Ok(views.html.GamePage("Game-Codez-Homepage"))
  }

  def LoginPage = Action {
    Ok(views.html.LoginPage("Game-Codez-Homepage"))
  }

def MembersPage = Action {
  Ok(views.html.MembersPage("Game-Codez-Homepage"))
}
  def Fallout4Page = Action {
    Ok(views.html.Fallout4Page("Game-Codez-Homepage"))
  }


}