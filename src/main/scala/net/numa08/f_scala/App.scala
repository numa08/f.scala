package net.numa08.f_scala

import net.numa08.f_scala.db.FDatabase

/** The launched conscript entry point */
class f extends xsbti.AppMain {
  def run(config: xsbti.AppConfiguration) = {
    Exit(f.run(config.arguments))
  }
}

object f {
  /**
   * Shared by the launched version and the runnable version,
   * returns the process status code
   */
  def run(args: Array[String]): Int = {

    val cli = if (args.isEmpty) {
      new CLI()
    } else {
      new CLI(args)
    }

    cli.subcommand match {
      case Some(cli.initdb) => {
        FDatabase.init
        0
      }
      case Some(cli.book) => {
        FDatabase.Book(cli.book.season.get, cli.book.serial.get, cli.book.title.get, cli.book.number.get).filter
        0
      }
      case Some(cli.work) => {
        FDatabase.Work(cli.work.title.get, cli.work.year.get).filter
        0
      }
      case _ => 1
    }
  }
  /** Standard runnable class entrypoint */
  def main(args: Array[String]) {
    System.exit(run(args))
  }
}

case class Exit(val code: Int) extends xsbti.Exit
