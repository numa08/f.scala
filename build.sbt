seq(conscriptSettings :_*)

organization := "net.numa08.f_scala"

name := "f_scala"

version := "0.1.1"

scalaVersion := "2.11.0"

scalacOptions ++= Seq("-Xlint")

libraryDependencies ++= Seq(
  "com.github.aselab" % "scala-activerecord_2.10" % "0.2.3",
  "org.slf4j" % "slf4j-nop" % "1.7.5",
  "com.h2database" % "h2" % "1.3.173",
  "com.github.aselab" % "scala-activerecord-specs_2.10" % "0.2.3" % "test",
  "org.specs2" % "specs2_2.10" % "2.0" % "test"
)

libraryDependencies += "org.rogach" %% "scallop" % "0.9.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.5" % "test"

