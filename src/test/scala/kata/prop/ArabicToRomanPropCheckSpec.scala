package kata.prop

import org.scalatest.prop._
import org.scalatest.{Matchers, PropSpec}
import kata.ConvertArabicToRoman._

import org.scalacheck.Gen

class ArabicToRomanPropCheckSpec
  extends PropSpec
    with GeneratorDrivenPropertyChecks
    with Matchers {

  //Generators
  val allInts = for (n <- Gen.choose(0, 1000)) yield n

  val endWith9 = allInts filter (_ % 10 == 9)

  val endsWith4 = allInts filter (_ % 10 == 4)

  override implicit val generatorDrivenConfig = PropertyCheckConfig(
    minSuccessful = 1000,
    maxDiscarded = 5000,
    minSize = 10,
    workers = Runtime.getRuntime.availableProcessors()
  )

  property("There can't be 3 consecutive I, X, C or M repeated") {
    forAll(allInts) { x =>
      convertToRoman(x) shouldNot include("XXXX")
      convertToRoman(x) shouldNot include("IIII")
      convertToRoman(x) shouldNot include("CCCC")
      convertToRoman(x) shouldNot include("MMMM")
    }
  }
  property("V, L, and D cannot be repeated, and there is no need to do so.") {
    forAll(allInts) { x =>
      convertToRoman(x) shouldNot include("VV")
      convertToRoman(x) shouldNot include("LL")
      convertToRoman(x) shouldNot include("DD")
    }
  }

  property("Should end with IX, if the number ends with 9") {
    forAll(endWith9, minSuccessful(10), maxDiscarded(100)) { x =>
      convertToRoman(x) should endWith("IX")
    }
  }

  property("Should end with IV, if the number ends with 4") {
    forAll(endsWith4, minSuccessful(10), maxDiscarded(100)) { x =>
      convertToRoman(x) should endWith("IV")
    }
  }
}
