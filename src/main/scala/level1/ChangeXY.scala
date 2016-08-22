//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

package level1

object ChangeXY extends App{

  def repString(s: String): String = {

    def go(n: Int, s: String): String = {
      n match {
        case 0 => s
        case _ => println("---"); go(n-1, repxwithy(s, n))
      }
    }
    def repxwithy(str: String, pos: Int): String = {
      if(s.charAt(pos).equals('x')) s.replace(s.charAt(pos), 'y') else s
    }

    go(s.length - 1, s)
  }

  val res = repString("axkxlx")

}
