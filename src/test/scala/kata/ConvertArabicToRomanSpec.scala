package kata

import org.scalatest.{Matchers, WordSpec}
import kata.ConvertArabicToRoman._


class ConvertArabicToRomanSpec extends WordSpec with Matchers {

  "convertToRoman" when {

    "invoked with integers with value <= 1000" should {

      "return VII, when input is 7" in {
        convertToRoman(7) should be("VII")
      }
      "return CDI, when input is 40" in {
        convertToRoman(40) should be("XL")
      }
      "return CDI, when input is 400" in {
        convertToRoman(400) should be("CD")
      }
      "return CDI, when input is 600" in {
        convertToRoman(600) should be("DC")
      }
      "return C, when input is 100" in {
        convertToRoman(100) should be("C")
      }
      "return DXXII, when input is 522" in {
        convertToRoman(522) should be("DXXII")
      }
      "return CXXXI, when input is 131" in {
        convertToRoman(131) should be("CXXXI")
      }
      "return DCCCXXII, when input is 822" in {
        convertToRoman(822) should be("DCCCXXII")
      }
      "return CCCX, when input is 310" in {
        convertToRoman(310) should be("CCCX")
      }
      "return CDI, when input is 401" in {
        convertToRoman(401) should be("CDI")
      }


    }

    "invoked with integers with value > 1000" should {

      "throws an exception, when value is 1001" in {
        intercept[RuntimeException] {
          convertToRoman(1001)
        } should have message ("Number greater than 1000!")
      }
    }
  }

}
