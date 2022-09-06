package challenges.lv2.do_equal_queues

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val s = Solution()

    val answer1 = s.solution(
      intArrayOf(3,2,7,2),
      intArrayOf(4,6,5,1)
    )
    val answer2 = s.solution(
      intArrayOf(1,2,1,2),
      intArrayOf(1,10,1,2)
    )
    val answer3 = s.solution(
      intArrayOf(1,1),
      intArrayOf(1,5)
    )

    Assertions.assertEquals(answer1, 2)
    Assertions.assertEquals(answer2, 7)
    Assertions.assertEquals(answer3, -1)
  }
}