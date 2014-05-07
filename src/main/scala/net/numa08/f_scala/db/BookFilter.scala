package net.numa08.f_scala.db

trait BookFilter {

  case class Book(season: Option[Int], serial: Option[Int], title: Option[String], number: Option[Int]) {
    def filter = {
      println("book filter")
    }
  }
}
