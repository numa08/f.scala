package net.numa08.f_scala.db

trait WorkFilter {

  case class Work(title: Option[String], year: Option[String]) {
    def filter = {
      println("work filter")
    }
  }
}
