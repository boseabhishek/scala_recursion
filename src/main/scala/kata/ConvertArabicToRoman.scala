package kata

import scala.annotation.tailrec

object ConvertArabicToRoman {

  val matches = Map(0 -> "", 4 -> "IV", 9 -> "IX", 40 -> "XL", 90 -> "XC", 400 -> "CD", 900 -> "CM", 1000 -> "M")

  def convertToRoman(number: Int): String = {

    def get1stAnd5th(i: Int) = i match {
      case 1 => ("I", "V")
      case 10 => ("X", "L")
      case 100 => ("C", "D")
    }

    def appendCharSeq(s: String, n: Int, accum: String): String = {
      if (n == 0) accum
      else appendCharSeq(s, n - 1, accum + s)
    }

    def createRomanChars(placeVal: Int, n: Int, accum: String): String = {
      val parts = get1stAnd5th(placeVal)
      val repeatedChars = appendCharSeq(parts._1, n, accum)
      if (n >= 5) parts._2 + repeatedChars.substring(5) else repeatedChars
    }

    def formatRoman(num: Int, pos: Int): String = matches.getOrElse(num * pos, createRomanChars(pos, num, "")).trim

    @tailrec
    def go(number: Int = number, inRoman: String, counter: Int): String = {
      number match {
        case 0 => inRoman
        case _ => go(number / 10, formatRoman(number % 10, counter) + inRoman, counter = counter * 10)
      }
    }

    if (number > 1000) throw new RuntimeException("Number greater than 1000!")
    else go(inRoman = "", counter = 1)
  }

}
