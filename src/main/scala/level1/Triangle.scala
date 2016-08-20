//We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
// the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication)
// the total number of blocks in such a triangle with the given number of rows.

package level1

object Triangle extends App{

  def findBlocks(rowNum: Int): Int = {

    def go(n: Int, blocks: Int): Int = {
      n match {
        case 0 => blocks
        case _  => go(n-1, blocks+n)
      }

    }
    go(rowNum, 0)
  }

  val x = findBlocks(3)
  println(x)

}
