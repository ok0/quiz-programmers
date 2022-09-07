package challenges.lv2.target_number

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val s = Solution()

//    val answer1 = s.solution(intArrayOf(1,1,1,1,1), 3)
    val answer2 = s.solution(intArrayOf(4,1,2,1), 4)

//    Assertions.assertEquals(answer1, 5)
    Assertions.assertEquals(answer2, 2)
  }
}