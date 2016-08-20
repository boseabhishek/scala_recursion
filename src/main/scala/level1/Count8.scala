// count the occurence of '7's in a number

package level1

import scala.annotation.tailrec


object Count8 extends App {

  def countOccOf7(n: Int): Int = {
    @tailrec
    def go(n: Int, count: Int): Int = {
      n match {
        case 0 => count
        case _ => go(n / 10, (count + isSeven(n)))
      }
    }

    def isSeven(dig: Int): Int = {
        if (dig % 10 == 8) 1 else 0
    }

   go(n, 0)
  }

    val x = countOccOf7(8118)
    println(x)

}
