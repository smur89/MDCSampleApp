name := """mdc-test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "ch.qos.logback" % "logback-core" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
libraryDependencies += "com.github.rishabh9" %% "mdc-propagation-dispatcher" % "0.0.5"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test


