package challenges.lv2.create_func

import java.util.*

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=kotlin
 *
 *
 * */
class Solution {
  fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val result = mutableListOf<Int>()
    val q: Queue<P> = LinkedList()

    progresses.forEachIndexed { index, p ->
      q.offer(P(index, p, speeds[index], 1))
    }

    while (!q.isEmpty()) {
      if (q.peek().isCompleted()) {
        val poll = q.poll()
        result[result.lastIndex] += 1

        if (!q.isEmpty()) {
          q.peek().days = poll.days
        }
      } else {
        q.peek().days++
        if (result.isEmpty() || result[result.lastIndex] > 0) {
          result.add(0)
        }
      }
    }

    return result.toIntArray()
  }
}

data class P(
  var id: Int,
  var progress: Int,
  var speed: Int,
  var days: Int
) {
  fun isCompleted() = (this.progress + (this.speed * this.days)) >= 100
}