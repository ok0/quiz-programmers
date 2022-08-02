package challenges.lv1.bad_user_reporter

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val id = listOf<String>("muzi", "frodo", "apeach", "neo")
    val report = listOf<String>("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
    val s1 = s.solution(
      id_list = id.toTypedArray(),
      report = report.toTypedArray(),
      k = 2
    )
    val a1 = listOf(2,1,1,0)

    Assertions.assertEquals(s1.contentToString(), a1.toString())
  }
}