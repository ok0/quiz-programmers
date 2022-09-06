package challenges.lv1.min_size_square

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val s = Solution()

    val answer1 = s.solution(
      arrayOf(
        intArrayOf(60, 50),
        intArrayOf(30, 70),
        intArrayOf(60, 30),
        intArrayOf(80, 40)
      )
    )

    val answer2 = s.solution(
      arrayOf(
        intArrayOf(10, 7),
        intArrayOf(12, 3),
        intArrayOf(8, 15),
        intArrayOf(14, 7),
        intArrayOf(5, 15)
      )
    )

    val answer3 = s.solution(
      arrayOf(
        intArrayOf(14, 4),
        intArrayOf(19, 6),
        intArrayOf(6, 16),
        intArrayOf(18, 7),
        intArrayOf(7, 11),
      )
    )

    Assertions.assertEquals(answer1, 4000)
    Assertions.assertEquals(answer2, 120)
    Assertions.assertEquals(answer3, 133)
  }
}