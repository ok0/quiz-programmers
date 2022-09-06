package challenges.lv1.temperament_test

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 *
 *
 * */
class Solution {
  fun solution(survey: Array<String>, choices: IntArray): String {
    val c = hashMapOf<Char, Int>(
      'R' to 0, 'T' to 0,
      'C' to 0, 'F' to 0,
      'J' to 0, 'M' to 0,
      'A' to 0, 'N' to 0,
    )
    val point = listOf(3, 2, 1, 0, 1, 2, 3)

    survey.forEachIndexed { idx, s ->
      val choiced = choices[idx]
      val pointed = point[choiced - 1]

      if (choiced < 4) {
        c[s[0]] = c[s[0]]!! + pointed
      } else if (choiced > 4) {
        c[s[1]] = c[s[1]]!! + pointed
      }
    }

    val first = if (c['R']!! > c['T']!!) 'R' else if (c['R']!! < c['T']!!) 'T' else 'R'
    val second = if (c['C']!! > c['F']!!) 'C' else if (c['C']!! < c['F']!!) 'F' else 'C'
    val third = if (c['J']!! > c['M']!!) 'J' else if (c['J']!! < c['M']!!) 'M' else 'J'
    val fourth = if (c['A']!! > c['N']!!) 'A' else if (c['A']!! < c['N']!!) 'N' else 'A'

    return "$first$second$third$fourth"
  }
}