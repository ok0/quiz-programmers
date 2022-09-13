package challenges.lv3.priority_queue

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val s = Solution()

    val answer1 = s.solution(arrayOf("I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"))
    val answer2 = s.solution(arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"))

    Assertions.assertEquals(answer1.contentToString(), intArrayOf(0, 0).contentToString())
    Assertions.assertEquals(answer2.contentToString(), intArrayOf(333, -45).contentToString())
  }
}