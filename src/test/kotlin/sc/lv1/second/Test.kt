package sc.lv1.second

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {
  @Test
  fun test() {
    val a1 = Solution().solution(3, 20, 4)
    val s1 = 10

    Assertions.assertEquals(a1, s1)
  }
}