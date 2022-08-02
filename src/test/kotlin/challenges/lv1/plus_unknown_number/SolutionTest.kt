package challenges.lv1.plus_unknown_number

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0))
    val answer2 = s.solution(intArrayOf(5,8,4,0,6,7,9))

    Assertions.assertEquals(answer1, 14)
    Assertions.assertEquals(answer2, 6)
  }
}