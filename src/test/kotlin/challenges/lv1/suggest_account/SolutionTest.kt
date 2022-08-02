package challenges.lv1.suggest_account

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val param1 = listOf("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi")
    val param2 = listOf("z-+.^.", "z--")
    val param3 = listOf("=.=", "aaa")
    val param4 = listOf("123_.def", "123_.def")
    val param5 = listOf("abcdefghijklmn.p", "abcdefghijklmn")

    Assertions.assertEquals(s.solution(param1[0]), param1[1])
    Assertions.assertEquals(s.solution(param2[0]), param2[1])
    Assertions.assertEquals(s.solution(param3[0]), param3[1])
    Assertions.assertEquals(s.solution(param4[0]), param4[1])
    Assertions.assertEquals(s.solution(param5[0]), param5[1])
  }
}