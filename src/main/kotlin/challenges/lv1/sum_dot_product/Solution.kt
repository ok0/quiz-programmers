package challenges.lv1.sum_dot_product

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 *
 * */
class Solution {
  fun solution(a: IntArray, b: IntArray): Int {
    return a.mapIndexed { idx, n ->
      n * b[idx]
    }.sum()
  }
}