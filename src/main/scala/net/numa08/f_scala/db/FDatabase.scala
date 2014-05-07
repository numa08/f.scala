package net.numa08.f_scala.db

class FDatabase {

}

object FDatabase extends DatabaseInitializer with BookFilter with WorkFilter {
  val SEASON_LAST = 4
}