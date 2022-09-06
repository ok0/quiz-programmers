package challenges.lv1.temperament_test

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    //
    val s1 = Solution()
    val s2 = SolutionLambda()

    //
    val param1to1 = arrayOf("AN", "CF", "MJ", "RT", "NA")
    val param1to2 = intArrayOf(5, 3, 2, 7, 5)
    val param2to1 = arrayOf("TR", "RT", "TR")
    val param2to2 = intArrayOf(7,1, 3)

    //
    val answer1to1 = s1.solution(param1to1, param1to2)
    val answer1to2 = s1.solution(param2to1, param2to2)
    val answer2to1 = s2.solution(param1to1, param1to2)
    val answer2to2 = s2.solution(param2to1, param2to2)

    //
    val realAnswer1 = "TCMA"
    val realAnswer2 = "RCJA"

    //
    Assertions.assertEquals(answer1to1, realAnswer1)
    Assertions.assertEquals(answer1to2, realAnswer2)
    Assertions.assertEquals(answer2to1, realAnswer1)
    Assertions.assertEquals(answer2to2, realAnswer2)
  }
}