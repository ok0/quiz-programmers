package skill_check.lv1.sum_sign_numbers

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 *
 */
class Solution {
  fun solution(absolutes: IntArray, signs: BooleanArray): Int
    = absolutes.mapIndexed { idx, n ->
      when (signs[idx]) {
        true -> n
        false -> (n*-1)
      }
    }.sum()
}