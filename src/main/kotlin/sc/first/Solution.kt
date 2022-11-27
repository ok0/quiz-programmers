package sc.first

fun main() {
  val lottos1 = intArrayOf(44, 1, 0, 0, 31, 25)
  val winNums1 = intArrayOf(31, 10, 45, 1, 6, 19)
  val answer1 = intArrayOf(3, 5)

  val lottos2 = intArrayOf(0, 0, 0, 0, 0, 0)
  val winNums2 = intArrayOf(38, 19, 20, 40, 15, 25)
  val answer2 = intArrayOf(1, 6)

  val lottos3 = intArrayOf(45, 4, 35, 20, 3, 9)
  val winNums3 = intArrayOf(20, 9, 3, 45, 4, 35)
  val answer3 = intArrayOf(1, 1)

  val s1 = Solution().solution(lottos1, winNums1)
  val s2 = Solution().solution(lottos2, winNums2)
  val s3 = Solution().solution(lottos3, winNums3)

  println("${answer1.joinToString("," )} -> ${s1.joinToString(",")}")
  println("${answer2.joinToString("," )} -> ${s2.joinToString(",")}")
  println("${answer3.joinToString("," )} -> ${s3.joinToString(",")}")
}

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