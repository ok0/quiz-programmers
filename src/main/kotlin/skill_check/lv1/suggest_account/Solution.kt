package skill_check.lv1.suggest_account

/*
*
* https://school.programmers.co.kr/learn/courses/30/lessons/72410
*
* 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
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