package challenges.lv2.perfect_square

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer = s.solution(8, 12)
    Assertions.assertEquals(answer, 80)
  }
}