package skill_test.lv1.first

class Solution {
  fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    fun rank(r: Int) = when (r) {
      6 -> 1
      5 -> 2
      4 -> 3
      3 -> 4
      2 -> 5
      else -> 6
    }

    var matchedMin = 0
    var matchedMax = 0

    val winNumsSet = win_nums.toSet()
    lottos.forEach {
      if (it == 0) {
        matchedMax++
      } else if (winNumsSet.contains(it)) {
        matchedMin++
        matchedMax++
      }
    }

    return intArrayOf(rank(matchedMax), rank(matchedMin))
  }
}