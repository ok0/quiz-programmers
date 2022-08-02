package skill_check.lv1.suggest_account

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/72410
 *
 * */
class Solution {
  companion object {
    val AVAILABLE_CHAR = setOf('-', '_', '.')
  }

  fun solution(new_id: String): String {
    fun isAvailableChar(char: Char) = (char.isDigit() || AVAILABLE_CHAR.contains(char) || ('a'..'z').contains(char))
    fun removeLastDot(string: String): String {
      var new = string
      while (new.isNotEmpty() && new.last() == '.') {
        new = new.substring(0 until new.lastIndex)
      }

      return new
    }
    fun removeFirstDot(string: String): String {
      var new = string
      while (new.isNotEmpty() && new.first() == '.') {
        new = new.substring(1 .. new.lastIndex)
      }

      return new
    }

    return new_id
      .lowercase()
      .filter { isAvailableChar(it) }
      .let { s ->
        var new = s
        while (new.contains("..")) {
          new = new.replace("..", ".")
        }

        new
      }
      .let { removeLastDot(removeFirstDot(it)) }
      .ifEmpty { "a" }
      .let {
        removeLastDot(
          if (it.length >= 16) it.substring(0 until 15)
          else it
        )
      }
      .let {
        var new = it
        while (new.length < 3) {
          new += new.last()
        }

        new
      }
  }
}