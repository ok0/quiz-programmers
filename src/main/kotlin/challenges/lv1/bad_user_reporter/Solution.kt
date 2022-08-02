package challenges.lv1.bad_user_reporter


/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 *
 * */
class Solution {
  fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val answer = id_list.associateWith { 0 }.toMutableMap()
    val bad = id_list.associateWith { mutableSetOf<String>() }

    report.forEach {
      val c = it.split(" ")
      val u = c[0]
      val b = c[1]

      bad[b]?.add(u)
    }

    bad.forEach { r ->
      if (r.value.size >= k) {
        r.value.forEach {
          answer[it] = answer[it]!! + 1
        }
      }
    }

    return answer.values.toIntArray()
  }
}