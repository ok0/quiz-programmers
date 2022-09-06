package challenges.lv1.min_size_square

import kotlin.math.max

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 *
 *
 * */
class Solution {
  fun solution(sizes: Array<IntArray>): Int {
    var maxHeight = 0
    var maxWidth = 0

    sizes.forEach { size ->
      if (size[0] > size[1]) {
        maxHeight = max(maxHeight, size[0])
        maxWidth = max(maxWidth, size[1])
      } else {
        maxHeight = max(maxHeight, size[1])
        maxWidth = max(maxWidth, size[0])
      }
    }

    return (maxHeight * maxWidth)
  }
}