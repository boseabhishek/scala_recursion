//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14"

package level1

import scala.annotation.tailrec

object ChangePi extends App{

  def repPiInString(s: String): String = {
    @tailrec
    def go(n: Int, s: String): String = {
      n match {
        case 0 => s
        case _ => go(n-1, repxwithy(s, n))
      }
    }
    def repxwithy(str: String, pos: Int): String = {
      if(s.charAt(pos).equals('p') && s.charAt(pos+1).equals('i')) {
        var s1 = s.replace(s.charAt(pos), '3')
        val nextPos = pos + 1
        s1.replace(s1.charAt(nextPos), '.').replaceAll("3.", "3.14")
      }
      else s
    }

    go(s.length - 1, s)
  }

  val res = repPiInString("fpikpi")
  println(s"new string $res")

}
