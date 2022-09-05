package e.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class P01Test {
  @Test
  fun test() {
    val s = P01()

    val answer01 = s.solution(arrayOf(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(3, 10)))
    val answer02 = s.solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2)))

    Assertions.assertEquals(answer01.contentToString(), intArrayOf(1, 10).contentToString())
    Assertions.assertEquals(answer02.contentToString(), intArrayOf(2, 1).contentToString())
  }
}