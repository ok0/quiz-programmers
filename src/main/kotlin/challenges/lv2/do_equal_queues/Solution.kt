package challenges.lv2.do_equal_queues

import java.util.*

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/118667
 *
 *
 * */
class Solution {
  fun solution(queue1: IntArray, queue2: IntArray): Int {
    // is odd number ?
    var sum1 = queue1.sum().toLong()
    var sum2 = queue2.sum().toLong()

    if ((sum1 + sum2) % 2 == 1L) {
      return -1
    }

    // run
    val q1: Queue<Int> = LinkedList()
    val q2: Queue<Int> = LinkedList()
    queue1.forEach { q1.offer(it) }
    queue2.forEach { q2.offer(it) }

    var count = 0
    val limit = queue1.size * 3

    while (count < limit) {
      if (sum1 == sum2) {
        return count
      }

      if (sum1 > sum2) {
        sum1 -= q1.peek()
        sum2 += q1.peek()
        q2.offer(q1.poll())
      } else {
        sum1 += q2.peek()
        sum2 -= q2.peek()
        q1.offer(q2.poll())
      }

      count++
    }

    return -1
  }
}