package challenges.lv3.coding_test_time

import kotlin.math.max
import kotlin.math.min

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/118668?language=kotlin
 *
 * 알고력 기본 비용 1,
 * 코딩력 기본 비용 1,
 *
 * 알고력,
 * 코딩력,
 * [필요 알고력, 필요 코딩력, 획득 알고력, 획득 코딩력, 문제 풀이 비용]
 *
 * */
class Solution {
  companion object {
    const val COST_ALP = 1
    const val COST_COP = 1
    const val COST_MAX = 9999999
  }

  fun solution(inputAlp: Int, inputCop: Int, problems: Array<IntArray>): Int {
    var maxALP = 0
    var maxCOP = 0

    problems.forEach {
      maxALP = max(it[0], maxALP)
      maxCOP = max(it[1], maxCOP)
    }

    val alp = if (inputAlp > maxALP) maxALP else inputAlp
    val cop = if (inputCop > maxCOP) maxCOP else inputCop

    var result = Array(maxALP + 2) { IntArray(maxCOP + 2) { COST_MAX } }
    result[alp][cop] = 0
    for (a in alp .. maxALP) {
      for (c in cop .. maxCOP) {

        result[a+1][c] = min(result[a+1][c], result[a][c] + COST_ALP)
        result[a][c+1] = min(result[a][c+1], result[a][c] + COST_COP)

        problems.forEach { problem ->
          val p = Problem(problem)
          if (p.isInPower(a, c)) {
            if (a + p.rwdALP > maxALP && c + p.rwdCOP >= maxCOP) {
              result[maxALP][maxCOP] = min(result[a][c] + p.cost, result[maxALP][maxCOP])
            } else if (a + p.rwdALP > maxALP) {
              result[maxALP][c + p.rwdCOP] = min(result[a][c] + p.cost, result[maxALP][c + p.rwdCOP])
            } else if (c + p.rwdCOP > maxCOP) {
              result[a + p.rwdALP][maxCOP] = min(result[a][c] + p.cost, result[a + p.rwdALP][maxCOP])
            } else if (a + p.rwdALP <= maxALP && c + p.rwdCOP <= maxCOP) {
              result[a + p.rwdALP][c + p.rwdCOP] = min(result[a][c] + p.cost, result[a + p.rwdALP][c + p.rwdCOP])
            }
          }
        }
      }
    }

    return result[maxALP][maxCOP]
  }
}

class Problem(problem: IntArray) {
  private val reqALP = problem[0]
  private val reqCOP = problem[1]
  val rwdALP = problem[2]
  val rwdCOP = problem[3]
  val cost = problem[4]

  fun isInPower(alq: Int, cop: Int) = alq >= reqALP && cop >= reqCOP
}