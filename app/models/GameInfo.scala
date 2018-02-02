package models


import play.api.data.Form
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer

case class GameCard(gameImage: String,gameID: Int,gameVid: String,gameInfo: String,gameSpecs: String)

object GameCard {



  val cardsList = ArrayBuffer(
    GameCard("https://store.ubi.com/dw/image/v2/ABBS_PRD/on/demandware.static/-/Sites-masterCatalog/default/dw6831a8d5/images/large/59245fb4adc724ef3f8b456c-9.jpg?sw=783&sh=440&sm=fit",0,"https://www.youtube.com/watch?v=Myd33zH1NTc","Ancient Egypt, a land of majesty and intrigue, is disappearing in a ruthless fight for power. Unveil dark secrets and forgotten myths as you go back to the one founding moment: The Origins of the Assassin’s Brotherhood.\n\nA COUNTRY TO DISCOVER\nSail down the Nile, uncover the mysteries of the pyramids or fight your way against dangerous ancient factions and wild beasts as you explore this gigantic and unpredictable land.\n\nA NEW STORY EVERY TIME YOU PLAY\nEngage into multiple quests and gripping stories as you cross paths with strong and memorable characters, from the wealthiest high-born to the most desperate outcasts.","MINIMUM:\nRequires a 64-bit processor and operating system\nOS: Windows 7/8/10 (64-bit OS required)\nProcessor: Intel Core i5-2300 2.8 GHz/AMD Phenom II X4 945 3.0 GHz or equivalent\nMemory: 8 GB RAM\nGraphics: NVIDIA GTX 550 Ti 2GB/AMD Radeon HD 7870 2GB or equivalent\nStorage: 30 GB available space"),
    GameCard("http://steam.cryotank.net/wp-content/gallery/fallout4/Fallout-4-07-HD.png",1,"VID","info","specs"),
    GameCard("http://media.wwg.com/2017/02/doom-203405.jpg",2,"VID","info","specs"),
    GameCard("https://www.fossmint.com/wp-content/uploads/2017/04/PayDay-2-Game-for-Linux.jpg",3,"VID","info","specs")
  )

}