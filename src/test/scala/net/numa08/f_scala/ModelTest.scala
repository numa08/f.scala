package models

import org.rogach.scallop.UsefulMatchers
import org.scalatest.BeforeAndAfter
import com.github.aselab.activerecord.dsl._

class ModelTest extends UsefulMatchers with BeforeAndAfter {

  before {
    Tables.initialize
  }

  test("save books") {
    Book("ドラえもん", 1, 1, 1).create
    Book("オバケのQ太郎", 1, 27, 1).create
    Book("パーマン", 1, 44, 1).create
    Book.count === 3
  }

  test("book and work associations") {
    val book = Book("ドラえもん", 1, 1, 1).create
    val work = Work("新連載の予告", 1969)
    book.works << work

    book.works.toList === List(Work("新連載の予告", 1969))
  }

  after {
    Tables.cleanup
  }

}
