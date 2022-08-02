package skill_check.lv1.sum_sign_numbers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true))
    val answer2 = s.solution(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true))
    
    Assertions.assertEquals(answer1, 9)
    Assertions.assertEquals(answer2, 0)
  }
}