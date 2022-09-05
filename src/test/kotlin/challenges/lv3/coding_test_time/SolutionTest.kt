package challenges.lv3.coding_test_time

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution(
      10,
      10,
      arrayOf(
        intArrayOf(10,15,2,1,2),
        intArrayOf(20,20,3,3,4)
      )
    )
    val answer2 = s.solution(
      0,
      0,
      arrayOf(
        intArrayOf(0,0,2,1,2),
        intArrayOf(4,5,3,1,2),
        intArrayOf(4,11,4,0,2),
        intArrayOf(10,4,0,4,2)
      )
    )
    Assertions.assertEquals(answer1, 15)
    Assertions.assertEquals(answer2, 13)
  }
}