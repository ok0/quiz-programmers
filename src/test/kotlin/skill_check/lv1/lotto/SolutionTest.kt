package skill_check.lv1.lotto

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val param1 = listOf(listOf(44, 1, 0, 0, 31, 25), listOf(31, 10, 45, 1, 6, 19), listOf(3, 5))
    val param2 = listOf(listOf(0, 0, 0, 0, 0, 0), listOf(38, 19, 20, 40, 15, 25), listOf(1, 6))
    val param3 = listOf(listOf(45, 4, 35, 20, 3, 9), listOf(20, 9, 3, 45, 4, 35), listOf(1, 1))

    Assertions.assertEquals(s.solution(param1[0].toIntArray(), param1[1].toIntArray()).contentToString(), param1[2].toIntArray().contentToString())
    Assertions.assertEquals(s.solution(param2[0].toIntArray(), param2[1].toIntArray()).contentToString(), param2[2].toIntArray().contentToString())
    Assertions.assertEquals(s.solution(param3[0].toIntArray(), param3[1].toIntArray()).contentToString(), param3[2].toIntArray().contentToString())
  }
}