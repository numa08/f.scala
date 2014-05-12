package models

import com.github.aselab.activerecord.{ ActiveRecordTables, ActiveRecordCompanion, ActiveRecord }
import com.github.aselab.activerecord.dsl._

case class Book(title: String, number: Int, serial: Int) extends ActiveRecord {
  lazy val works = hasMany[Work]
}

object Book extends ActiveRecordCompanion[Book]

case class Work(subject: String, year: Int) extends ActiveRecord {
  val bookId : Option[Long] = None

  lazy val containedId = belongsTo[Book]
}

object Work extends ActiveRecordCompanion[Work]

object Tables extends ActiveRecordTables {
  val books = table[Book]
  val works = table[Work]
}