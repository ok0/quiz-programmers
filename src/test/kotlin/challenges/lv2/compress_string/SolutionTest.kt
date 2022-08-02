package challenges.lv2.compress_string

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution("aabbaccc")
    val answer2 = s.solution("ababcdcdababcdcd")
    val answer3 = s.solution("abcabcdede")
    val answer4 = s.solution("abcabcabcabcdededededede")
    val answer5 = s.solution("xababcdcdababcdcd")

    Assertions.assertEquals(answer1, 7)
    Assertions.assertEquals(answer2, 9)
    Assertions.assertEquals(answer3, 8)
    Assertions.assertEquals(answer4, 14)
    Assertions.assertEquals(answer5, 17)
  }
}