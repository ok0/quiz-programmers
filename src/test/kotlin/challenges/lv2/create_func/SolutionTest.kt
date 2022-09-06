package challenges.lv2.create_func

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val s = Solution()

    val answer1 = s.solution(
      intArrayOf(93, 30, 55),
      intArrayOf(1, 30, 5)
    )
    val answer2 = s.solution(
      intArrayOf(95, 90, 99, 99, 80, 99),
      intArrayOf(1, 1, 1, 1, 1, 1)
    )

    Assertions.assertEquals(answer1.contentToString(), intArrayOf(2, 1).contentToString())
    Assertions.assertEquals(answer2.contentToString(), intArrayOf(1, 3, 2).contentToString())
  }
}