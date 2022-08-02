package challenges.lv2.perfect_square

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/62048
 *
 * */
class Solution {
  fun solution(w: Int, h: Int): Long {
    fun gcd(w: Long, h: Long): Long {
      return if (h == 0L) {
        w
      } else {
        gcd(h, w%h)
      }
    }

    val wl = w.toLong()
    val hl = h.toLong()
    return (wl*hl)-((wl+hl)-gcd(wl, hl))
  }
}