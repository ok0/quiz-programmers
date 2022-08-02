package challenges.lv2.open_chatting

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun solutionTest() {
    val s = Solution()

    val answer1 = s.solution(
      listOf("Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan").toTypedArray()
    )

    Assertions.assertEquals(
      answer1.contentToString(),
      listOf("Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다.").toString()
    )
  }
}