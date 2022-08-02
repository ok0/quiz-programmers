package challenges.lv1.claw_crane

import java.util.*

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/64061
 *
 * */
class Solution {
  fun solution(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0

    val width = board[0].lastIndex
    val stack = Stack<Int>()

    moves.forEach { n ->
      val position = (n - 1)
      var last = 0
      var isPicked = false
      while (!isPicked && last <= width) {
        val picked = board[last][position]
        if (picked != 0) {
          if (!stack.isEmpty() && stack.peek() == picked) {
            answer += 2
            stack.pop()
          } else {
            stack.add(picked)
          }

          board[last][position] = 0
          isPicked = true
        }

        last++
      }
    }

    return answer
  }
}