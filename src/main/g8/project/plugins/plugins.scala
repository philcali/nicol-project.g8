import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val lwjglPlugin = "com.github.philcali" % "sbt-lwjgl-plugin" % "$sbt_lwjgl_version$"
}
