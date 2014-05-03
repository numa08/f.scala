package net.numa08.f_scala

import org.rogach.scallop.{ Subcommand, ScallopConf }

class CLI(args: Seq[String]) extends ScallopConf(args) {

  val initdb = new Subcommand("initdb")
  val book = new Subcommand("book")
  val work = new Subcommand("work")
}
