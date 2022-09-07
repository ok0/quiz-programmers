package challenges.lv2.target_number

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *
 *
 *
 * */
class Solution {
  fun solution(numbers: IntArray, target: Int): Int {
    var result = 0
    var leaves = mutableListOf<Int>(0)

    for (n in numbers) {
      val tmp = mutableListOf<Int>()
      for (l in leaves) {
        tmp.add(l + n)
        tmp.add(l - n)
      }
      leaves = tmp
    }

    for (l in leaves) {
      if (l == target) {
        result++
      }
    }

    return result
  }
}