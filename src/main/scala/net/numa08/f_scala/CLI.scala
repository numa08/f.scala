package net.numa08.f_scala

import org.rogach.scallop.{ ScallopConf, Subcommand }
import net.numa08.f_scala.db.FDatabase

class CLI(args: Seq[String] = Seq("--help")) extends ScallopConf(args) {

  val initdb = new Subcommand("initdb")

  val book = new Subcommand("book") {
    val season = opt[Int](validate = (s: Int) => { s > 0 && s <= FDatabase.SEASON_LAST })
    val serial = opt[Int]("Serial", validate = (0<))
    val title = opt[String]()
    val number = opt[Int](validate = (0<))
  }
  val work = new Subcommand("work")

  version("f.scala 0.1.0 (c) 2014 numa numa08")
  banner(
    """Do you like "Sukoshi Fushigi(SF)"? if you like so...
      |USAGE
      |f [SUBCOMMANDS] [OPTION]
    """.stripMargin)
}

