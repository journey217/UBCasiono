package main.State

import main.gameLogic.Player.Player
import main.gameLogic.blackJack
import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readLine

class blackjackState(var Players :ArrayBuffer[Player]) extends State {
  override def run(): Unit = {
    if (Players.length == 1) {
      Players = Players :+ new Player("Dealer")
    }
    val newGame:blackJack = new blackJack(Players)

    val myPlayer: Player = Players.head

    newGame.deal()

    println("your cards are")
    myPlayer.displayBJ()
    println("")

    println("Hit or Stay or Double Down")
      var read = readLine()
        if (read == "Hit"){
          
        }

  }

}
