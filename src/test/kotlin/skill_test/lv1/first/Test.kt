package skill_test.lv1.first

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Test {
  @Test
  fun test() {
    val lottos1 = intArrayOf(44, 1, 0, 0, 31, 25)
    val winNums1 = intArrayOf(31, 10, 45, 1, 6, 19)
    val answer1 = intArrayOf(3, 5)

    val lottos2 = intArrayOf(0, 0, 0, 0, 0, 0)
    val winNums2 = intArrayOf(38, 19, 20, 40, 15, 25)
    val answer2 = intArrayOf(1, 6)

    val lottos3 = intArrayOf(45, 4, 35, 20, 3, 9)
    val winNums3 = intArrayOf(20, 9, 3, 45, 4, 35)
    val answer3 = intArrayOf(1, 1)

    val s1 = Solution().solution(lottos1, winNums1)
    val s2 = Solution().solution(lottos2, winNums2)
    val s3 = Solution().solution(lottos3, winNums3)

    Assertions.assertEquals(answer1.contentToString(), s1.contentToString())
    Assertions.assertEquals(answer2.contentToString(), s2.contentToString())
    Assertions.assertEquals(answer3.contentToString(), s3.contentToString())
  }
}