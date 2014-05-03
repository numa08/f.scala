seq(conscriptSettings :_*)

organization := "net.numa08.f_scala"

name := "f.scala"

version := "0.1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "com.github.aselab" % "scala-activerecord_2.10" % "0.2.3",
  "org.slf4j" % "slf4j-nop" % "1.7.5",
  "com.h2database" % "h2" % "1.3.173"
)

libraryDependencies += "org.rogach" %% "scallop" % "0.9.5"

