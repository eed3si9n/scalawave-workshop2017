import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization in ThisBuild := "com.example",
    scalafmtOnCompile in ThisBuild := true,
    scalafmtVersion in ThisBuild := "0.6.8",
    name := "foo",
    sbtPlugin := true,
    libraryDependencies ++= List(gigahorseGithub, scalatest % Test)
  )
