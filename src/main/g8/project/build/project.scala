import sbt._

class Project(info: ProjectInfo) extends LWJGLProject(info) with Nicol {
  override def nicolVersion = "$nicol_version$"

  override def mainClass = Some("$package$.$game_class$")
}
