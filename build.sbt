import sbt.Keys._

//lazy val root = (project in file("."))
//  .settings(
//    name         := "hello",
//    organization := "com.example",
//    scalaVersion := "2.12.4",
//    version      := "0.1.0-SNAPSHOT"
//  )

lazy val commonSettings = Seq(
  name := "mining-lib",
  version := "0.1-SNAPSHOT",
  organization := "wolliq",
  scalaVersion := "2.11.8",
  test in assembly := {}
)

lazy val app = (project in file("app")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("wolliq.MiningLibMain"),
    // more settings here ...
  )

lazy val utils = (project in file("utils")).
  settings(commonSettings: _*).
  settings(
    assemblyJarName in assembly := "mining-lib.jar",
    // more settings here ...
  )