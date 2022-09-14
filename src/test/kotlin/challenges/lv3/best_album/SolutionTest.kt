package challenges.lv3.best_album

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val input11 = arrayOf("classic", "pop", "classic", "classic", "pop")
    val input12 = intArrayOf(500, 600, 150, 800, 2500)
    val result1 = intArrayOf(4, 1, 3, 0)

    val input21 = arrayOf(    "a",  "b",  "c",  "d",  "a",  "d",  "d",  "d",  "a",  "a",  "c",  "c")
    val input22 = intArrayOf( 100,  300,  400,  150,  100,  300,  200,  600,  700,  110,  900,  9000)
    val result2 = intArrayOf(11,10,7,5,8,9,1)

    // kotlin
//    val s = Solution()
//    val answer1 = s.solution(input11, input12)
//    Assertions.assertEquals(answer1.contentToString(), result1.contentToString())

    // java
    val sj = SolutionJava()
    val answer2 = sj.solution(input21, input22)
    Assertions.assertEquals(answer2.contentToString(), result2.contentToString())
  }
}