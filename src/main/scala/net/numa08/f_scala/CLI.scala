package net.numa08.f_scala

import org.rogach.scallop.{ ScallopConf, Subcommand }

class CLI(args: Seq[String] = Seq("--help")) extends ScallopConf(args) {

  val initdb = new Subcommand("initdb")
  val book = new Subcommand("book")
  val work = new Subcommand("work")

  version("f.scala 0.1.0 (c) 2014 numa numa08")
  banner(
    """Do you like "Sukoshi Fushigi(SF)"? if you like so...
      |USAGE
      |f [SUBCOMMANDS] [OPTION]
    """.stripMargin)
}
