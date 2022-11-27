package sc.second

fun main() {
  val a1 = Solution().solution(3, 20, 4)
  val s1 = 10

  print("$a1, $s1")
}

class Solution {
  fun solution(price: Int, money: Int, count: Int): Long {
    return (price * count * ((count + 1) / 2) - money).run { if (this > 0) this else 0 }.toLong()
  }
}