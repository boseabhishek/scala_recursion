//Given an array of ints, compute recursively if the array contains a 6. We'll
//use the convention of considering only the part of the array that begins at the given index.
// In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

package level1

object Array6 extends App{

  def find6(num: Array[Int]): Boolean = {
    def go(num: Array[Int], index: Int): Boolean = {
      num(index) match {
        case 6 => true
        case _ => go(num, index+1)
      }
    }
    go(num, 0)
  }

  val x = find6(Array(1,2,3,5))

  println(s"x------>$x")

}
