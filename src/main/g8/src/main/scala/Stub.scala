package $package$

import nicol._
import input.Key._

object $game_class$ extends Game(Init("$game_title$", 800, 600) >> Main)

object Main extends GameScene with SyncableScene with StandardRenderer {
  def update = {
    draw("Hello $game_title$! Thank you for using Nicol", position = (300, 300))

    sync
    if (escape) End else None
  }
}
