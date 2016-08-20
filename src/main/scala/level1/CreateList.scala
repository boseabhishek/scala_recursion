// create a list of integers using recursion (no loop)

package level1

import scala.annotation.tailrec


object CreateList extends App{

  def createListByRec(n: Int): List[Int] = {
    @tailrec
    def go(n: Int, l: List[Int]): List[Int] = {
      n match {
        case 0 => l
        case _ => go(n-1, (n-1) :: l)
      }
    }

    go(n, List())
    // here, List() is the accumulator
    // see, the result..due to rescursion, insertion has taken place reversedly
  }


  val x = createListByRec(5)
  println(x)

  val xy = createListByRec(1)
  println(xy)

}
