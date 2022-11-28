package sc.lv1.second

class Solution {
  fun solution(price: Int, money: Int, count: Int): Long {
    return ((1..count).sumOf { it * price } - money).toLong()
  }
}