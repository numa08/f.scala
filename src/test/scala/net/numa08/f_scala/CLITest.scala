package net.numa08.f_scala

import org.rogach.scallop.UsefulMatchers

class CLITest extends UsefulMatchers {

  test("invoke init db") {
    val cli = new CLI(Seq("initdb"))
    cli.subcommand ==== Some(cli.initdb)
  }

  test("invoke book") {
    val cli = new CLI(Seq("book"))
    cli.subcommand ==== Some(cli.book)
  }

  test("invoke work") {
    val cli = new CLI(Seq("work"))
    cli.subcommand ==== Some(cli.work)
  }
}
