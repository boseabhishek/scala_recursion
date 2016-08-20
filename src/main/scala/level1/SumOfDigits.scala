//Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

package level1

object SumOfDigits extends App{

  def findSum(rowNum: Int): Int = {

    def go(n: Int, sum: Int): Int = {
      n match {
        case 0 => sum // pattern 1: base case
        case _  => go(n/10, sum + n%10) // pattern 2: always, recursive methodName(decrementor/looping, actual calc logic)
      }
    }
    go(rowNum, 0)
  }

  val x = findSum(9999)
  println(x)

}
