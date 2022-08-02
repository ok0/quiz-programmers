package skill_check.lv1.convert_string_to_digit

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 *
 * */
class Solution {
  companion object {
    val stringToDigit = mapOf(
      "zero" to "0",
      "one" to "1",
      "two" to "2",
      "three" to "3",
      "four" to "4",
      "five" to "5",
      "six" to "6",
      "seven" to "7",
      "eight" to "8",
      "nine" to "9"
    )
  }

  fun solution(s: String): Int {
    val answer = StringBuilder()
    val word = StringBuilder()
    s.forEach { c ->
      if (c.isDigit()) {
        answer.append(c)
      } else {
        word.append(c)
        stringToDigit[word.toString()]?.let { w ->
          answer.append(w)
          word.clear()
        }
      }
    }

    return answer.toString().toInt()
  }
}