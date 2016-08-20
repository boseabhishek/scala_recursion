//Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
// so powerN(3, 2) is 9 (3 squared).

package level1

import scala.annotation.tailrec

object Power extends App{

  def calcPower(n: Int, power: Int): Int = {
    @tailrec
    def go(power: Int, res: Int): Int = {
      power match {
        case 0 => res
        case _ => go(power-1, n*res)
      }
    }
    go(power, 1)
  }

  val result = calcPower(3, 3)
  println(result)

}
