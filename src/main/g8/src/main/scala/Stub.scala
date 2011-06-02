package $package$

import nicol._
import input.Key._

object $game_class$ extends Game(Init("$name$", 800, 600) >> Main)

object Main extends GameScene with SyncableScene with StandardRenderer {
  def update = {
    draw("Hello $name$! Thank you for using Nicol", position = (300, 300))

    if (escape) End else None
  }
}
