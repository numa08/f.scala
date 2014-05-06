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

  test("book filter by season (short)") {
    val cli = new CLI(Seq("book", "-s", "4"))
    cli.subcommand ==== Some(cli.book)
    cli.book.season.get ==== Some(4)
  }

  test("book filter by season") {
    val cli = new CLI(Seq("book", "--season", "4"))
    cli.book.season.get ==== Some(4)
  }

  test("book filter by serial (short)") {
    val cli = new CLI(Seq("book", "-S", "100"))
    cli.book.serial.get ==== Some(100)
  }

  test("book filter by serial") {
    val cli = new CLI(Seq("book", "--Serial", "100"))
    cli.book.serial.get ==== Some(100)
  }

  test("book filter by title(short)") {
    val cli = new CLI(Seq("book", "-t", "doraemon"))
    cli.book.title.get ==== Some("doraemon")
  }

  test("book filter by title") {
    val cli = new CLI(Seq("book", "--title", "doraemon"))
    cli.book.title.get ==== Some("doraemon")
  }

  test("book filter by number (short)") {
    val cli = new CLI(Seq("book", "-n", "100"))
    cli.book.number.get ==== Some(100)
  }

  test("book filter by number") {
    val cli = new CLI(Seq("book", "--number", "100"))
    cli.book.number.get ==== Some(100)
  }

  test("work filter by title (short)") {
    val cli = new CLI(Seq("work", "-t", "doraemon"))
    cli.work.title.get ==== Some("doraemon")
  }

  test("work filter by title") {
    val cli = new CLI(Seq("work", "--title", "doraemon"))
    cli.work.title.get ==== Some("doraemon")
  }

  test("work filter by year (short)") {
    val cli = new CLI(Seq("work", "-y", "s63"))
    cli.work.year.get ==== Some("s63")
  }

  test("work filter by year") {
    val cli = new CLI(Seq("work", "--year", "s63"))
    cli.work.year.get === Some("s63")
  }
}
