 libraryDependencies += {
  "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
}
addSbtPlugin("org.scala-sbt" % "sbt-contraband" % "0.3.0-M7")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.4.0")
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.3")
