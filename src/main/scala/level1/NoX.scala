//Given a string, compute recursively a new string where all the 'x' chars have been removed.

package level1

object NoX extends App{

  def repString(s: String): String = {

    def go(n: Int, s: String): String = {
      n match {
        case 0 => s
        case _ =>  go(n-1, repxwithy(s, n))
      }
    }
    def repxwithy(str: String, pos: Int): String = {
      if(s.charAt(pos).equals('x')) s.replace(s.charAt(pos), '-').replaceAll("-", "") else s
    }

    go(s.length - 1, s)
  }

  val res = repString("axkxlx")

  println(res)

}
