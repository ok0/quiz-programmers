package challenges.lv2.compress_string

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/60057
 *
 * */
class Solution {
  private fun Int.toOutput() = if (this == 0 || this == 1) "" else this.toString()

  fun solution(s: String): Int {
    return (1..(s.length / 2) + 1).minOfOrNull { size ->
      val sb = StringBuilder()
      var count = 0
      var pre = ""
      s.chunked(size).forEach { c ->
        if (pre.isBlank()) {
          count = 1
          pre = c
        } else if (pre == c) {
          count++
        } else {
          sb.append(count.toOutput())
          sb.append(pre)
          count = 1
          pre = c
        }
      }
      sb.append(count.toOutput())
      sb.append(pre)
      sb.toString().length
    } ?: 0
  }
}