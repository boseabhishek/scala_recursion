//We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

package level1

object BunnyEars extends App{

  def calcBunnyEars(n: Int): Int = {

    def go(n: Int, sum: Int): Int = {
      n match {
        case 0 => sum
        case _ => go(n-1, sum+2)
      }
    }
    go(n,0)
  }

  val sumOfears = calcBunnyEars(5)
  println(s"Total no. of ears::$sumOfears")
}


