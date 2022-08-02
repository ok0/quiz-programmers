package challenges.lv1.lotto

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484#fn1
 *
 * */
class Solution {
  fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    fun rank(matched: Int) = if (matched < 2) 6 else 7 - matched

    val filterd = lottos.filter { it != 0 }.toSet()
    val matched = win_nums.filter { filterd.contains(it) }.size
    val matchedMax = matched + (win_nums.size - filterd.size)

    return intArrayOf(rank(matchedMax), rank(matched))
  }
}