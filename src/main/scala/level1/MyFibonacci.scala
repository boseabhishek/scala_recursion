package level1

import scala.annotation.tailrec

object MyFibonacci extends App {

  println(fibonacci(9))

  def fibonacci(x: Int): BigInt = {
    @tailrec def go(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => go(x - 1, next, (next + prev))
    }
    go(x)
  }
}
