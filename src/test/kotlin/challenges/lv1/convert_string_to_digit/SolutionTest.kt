package challenges.lv1.convert_string_to_digit

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    Assertions.assertEquals(s.solution("one4seveneight"), 1478)
    Assertions.assertEquals(s.solution("23four5six7"), 234567)
    Assertions.assertEquals(s.solution("2three45sixseven"), 234567)
    Assertions.assertEquals(s.solution("123"), 123)
  }
}