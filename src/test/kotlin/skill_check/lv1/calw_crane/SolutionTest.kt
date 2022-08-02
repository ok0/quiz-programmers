package skill_check.lv1.calw_crane

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import skill_check.lv1.claw_crane.Solution

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution(
      arrayOf(
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 0, 3),
        intArrayOf(0, 2, 5, 0, 1),
        intArrayOf(4, 2, 4, 4, 2),
        intArrayOf(3, 5, 1, 3, 1)
      ),
      intArrayOf(1,5,3,5,1,2,1,4)
    )
    Assertions.assertEquals(answer1, 4)
  }
}