package sc.lv1.second

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {
  @Test
  fun test() {
    val s1 = Solution().solution(3, 20, 4)
    val a1 = 10

    Assertions.assertEquals(a1.toString(), s1.toString())
  }
}