ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "used-car-platform"
  )

libraryDependencies += "com.lihaoyi" %% "cask" % "0.9.2"