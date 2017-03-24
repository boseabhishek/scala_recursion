package kata

import scala.annotation.tailrec

object ConvertArabicToRoman {

  val units = Map(0 -> "", 1 -> " I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V", 6 -> "VI", 7 -> "VII", 8 -> "VIII", 9 -> "IX")

  val tens = Map(0 -> "", 1 ->"X", 2->"XX", 3->"XXX", 4->"XL", 5->"L", 6->"LX", 7->"LXX", 8->"LXXX", 9->"XC")

  val hundreds = Map(0 -> "", 1 ->"C", 2->"CC", 3->"CCC", 4->"CD", 5->"D", 6->"DC", 7->"DCC", 8->"DCCC", 9->"CM")

  def convertToRoman(number: Int): String = {

    def formatRoman(num: Int, str: String, counter: Int): String = {
      counter match {
        case 0 => units(num%10).trim+str
        case 1 => tens(num%10).trim+str
        case 2 => hundreds(num%10).trim+str
      }
    }
    @tailrec
    def go(n: Int, inRoman: String, counter: Int): String = {
      n match {
        case 0 => inRoman
        case _  => go(n/10, formatRoman(n, inRoman, counter), counter=counter+1) //unit(n%10).trim+sum
      }
    }

    number match {
      case 10 => "X"
      case 50 => "L"
      case 100 => "C"
      case 500 => "D"
      case 1000 => "M"
      case anyNum if anyNum>1000 => throw new RuntimeException("Number greater than 1000!")
      case _ => go(number, "", 0)
    }

  }

}
