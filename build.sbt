seq(conscriptSettings :_*)

organization := "net.numa08.f_scala"

name := "f_scala"

version := "0.1.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-Xlint")

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % "0.2.3",
  "org.slf4j" % "slf4j-nop" % "1.7.5",
  "com.h2database" % "h2" % "1.3.173"
)

libraryDependencies += "org.rogach" %% "scallop" % "0.9.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.5" % "test"

