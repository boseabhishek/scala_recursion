val l = List(1,2,3)

2 :: l


9 % 10
9/10

/*def countOccOf7(n: Int): Int = {

  def go(n: Int, count: Int): Int = {
    case 0 => count
    case _ => go(n / 10, (count + isSeven(n)))
  }

  def isSeven(dig: Int): Int = {
    if (n % 10 == 7) 1 else 0
  }

  go(n, 0)
}

countOccOf7(717)*/

val a = 'c'

val b = 'r'

val s1 = "abcdef"


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

