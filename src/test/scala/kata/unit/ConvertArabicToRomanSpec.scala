package kata.unit

import kata.ConvertArabicToRoman._
import org.scalatest.{Matchers, WordSpec}


class ConvertArabicToRomanSpec extends WordSpec with Matchers {

  "convertToRoman" when {

    "invoked with integers with value <= 1000" should {

      "return I, when input is 1" in {
        convertToRoman(1) should be("I")
      }
      "return IV, when input is 4" in {
        convertToRoman(4) should be("IV")
      }
      "return XXV, when input is 25" in {
        convertToRoman(25) should be("XXV")
      }
      "return CDI, when input is 40" in {
        convertToRoman(40) should be("XL")
      }
      "return XLI, when input is 41" in {
        convertToRoman(41) should be("XLI")
      }
      "return XLVIII, when input is 48" in {
        convertToRoman(48) should be("XLVIII")
      }
      "return L, when input is 50" in {
        convertToRoman(50) should be("L")
      }
      "return LXXVIII, when input is 78" in {
        convertToRoman(78) should be("LXXVIII")
      }
      "return C, when input is 100" in {
        convertToRoman(100) should be("C")
      }
      "return CXXXI, when input is 131" in {
        convertToRoman(131) should be("CXXXI")
      }
      "return CCCX, when input is 310" in {
        convertToRoman(310) should be("CCCX")
      }
      "return CDI, when input is 401" in {
        convertToRoman(401) should be("CDI")
      }
      "return CDIX, when input is 409" in {
        convertToRoman(409) should be("CDIX")
      }
      "return CDIX, when input is 500" in {
        convertToRoman(500) should be("D")
      }
      "return DXXII, when input is 522" in {
        convertToRoman(522) should be("DXXII")
      }
      "return CDI, when input is 600" in {
        convertToRoman(600) should be("DC")
      }
      "return CDI, when input is 607" in {
        convertToRoman(607) should be("DCVII")
      }
      "return DCCCXXII, when input is 822" in {
        convertToRoman(822) should be("DCCCXXII")
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
