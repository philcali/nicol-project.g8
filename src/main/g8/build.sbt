seq(nicolSettings: _*)

mainClass in (Compile, run) := Some("$package$.$game_class$")

name := "$name$"

version := "$version$"  

scalaVersion := "$scala_version$"

resolvers += "Diablo3D" at "http://adterrasperaspera.com/lwjgl"
