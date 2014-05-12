package net.numa08.f_scala.models

import com.github.aselab.activerecord.ActiveRecordSpecification

object ModelsSpecs extends ActiveRecordSpecification {

  "books" should {
    "save objects" in {
      Book("ドラえもん", 1, 1).create
      Book("オバケのQ太郎", 1, 27).create
      Book("パーマン", 1, 43).create

      Book.count === 3
    }
  }
}