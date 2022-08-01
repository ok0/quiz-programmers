package skill_check.lv1.press_keypad

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/67256
*
* */
class Solution {
  companion object {
    const val HAND_LEFT = "left"
    const val HAND_RIGHT = "right"

    const val HAND_LEFT_FLAG = "L"
    const val HAND_RIGHT_FLAG = "R"
    val position = mapOf(
      1 to arrayOf(0, 3), 2 to arrayOf(1, 3), 3 to arrayOf(2, 3),
      4 to arrayOf(0, 2), 5 to arrayOf(1, 2), 6 to arrayOf(2, 2),
      7 to arrayOf(0, 1), 8 to arrayOf(1, 1), 9 to arrayOf(2, 1),
                          0 to arrayOf(1, 0),
      //'*' to arrayOf(0, 0), 0 to arrayOf(1, 0), '#' to arrayOf(2, 0),
    )
  }

  fun solution(numbers: IntArray, hand: String): String {
    fun getDistance(cur: Array<Int>, dest: Array<Int>): Int {
      return when (cur[0] > dest[0]) {
        true -> cur[0] - dest[0]
        else -> dest[0] - cur[0]
      } + when (cur[1] > dest[1]) {
        true -> cur[1] - dest[1]
        else -> dest[1] - cur[1]
      }
    }

    val answer = StringBuilder()

    var leftPos = arrayOf(0, 0)
    var rightPos = arrayOf(2, 0)

    numbers.forEach { n ->
      (position[n]).run {
        if (this?.get(0) == 0) {
          leftPos = this
          answer.append(HAND_LEFT_FLAG)
        } else if (this?.get(0) == 2) {
          rightPos = this
          answer.append(HAND_RIGHT_FLAG)
        } else {
          val distanceFromLeft = getDistance(leftPos, this!!)
          val distanceFromRight = getDistance(rightPos, this)

          if (distanceFromLeft == distanceFromRight) {
            if (hand == HAND_LEFT) {
              leftPos = this
              answer.append(HAND_LEFT_FLAG)
            } else if (hand == HAND_RIGHT) {
              rightPos = this
              answer.append(HAND_RIGHT_FLAG)
            }
          } else if (distanceFromLeft < distanceFromRight) {
            leftPos = this
            answer.append(HAND_LEFT_FLAG)
          } else {
            rightPos = this
            answer.append(HAND_RIGHT_FLAG)
          }
        }
      }
    }

    return answer.toString()
  }
}