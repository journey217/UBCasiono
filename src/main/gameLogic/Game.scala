package main.gameLogic

import main.gameLogic.Player.Player

class Game(initPlayers: Array[Player]){
  var pot: Int = 0
  var players: Array[Player] = initPlayers
  val maxPlayers: Int = 6

  def addPlayer(player: Player): Boolean = {
    if(players.length >= 6){
      false
    }
    else{
      players :+ player
      true
    }
  }

  def removePlayer(player: Player): Boolean = {
    if(players.length <=2 ){
      //do something special to award pot to remaining player, end game
      false
    }
    else{
      //find the index of this player
      true
    }
  }

  def win(winner: Player, amount: Int): Unit ={
    winner.balance += amount
  }

  def bet(player: Player, amount: Int): Unit = {
    if(player.balance < amount){
      pot+=player.balance
      player.balance = 0
    }
    else{
      pot+=amount
      player.balance -= amount
    }
  }

  def Deal(player: Player): Unit = ???
}