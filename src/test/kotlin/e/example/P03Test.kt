package e.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class P03Test {
  @Test
  fun test() {
    val s = P03()

    Assertions.assertEquals(s.solution(3).contentToString(), intArrayOf(1,2,3).contentToString())
    Assertions.assertEquals(s.solution(5).contentToString(), intArrayOf(1,2,3,4,5).contentToString())
  }
}