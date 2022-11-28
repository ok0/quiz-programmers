package sc.lv1.second

class Solution {
  fun solution(price: Int, money: Int, count: Int): Long {
    return (price * count * ((count + 1) / 2) - money).run { if (this > 0) this else 0 }.toLong()
  }
}