package challenges.lv2.open_chatting

import java.lang.Exception

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42888
 *
 * */
class Solution {
  fun solution(record: Array<String>): Array<String> {
    val user = mutableMapOf<String, String>()
    val userIO = mutableListOf<String>()
    val typeIO = mutableListOf<IOType>()

    record.forEach { message ->
      val split = message.split(" ")

      val type = when (split[0]) {
        "Enter" -> IOType.ENTER
        "Leave" -> IOType.LEAVE
        "Change" -> IOType.CHANGE
        else -> IOType.UNKNOWN
      }

      if (type != IOType.CHANGE) {
        userIO.add(split[1])
        typeIO.add(type)
      }

      if (type == IOType.ENTER || type == IOType.CHANGE) {
        user[split[1]] = split[2]
      }
    }

    return userIO.mapIndexed { idx, userID ->
      IOType.toOutput(user[userID] ?: "", typeIO[idx])
    }.toTypedArray()
  }
}

enum class IOType {
  ENTER,
  LEAVE,
  CHANGE,
  UNKNOWN;

  companion object {
    fun toOutput(nickname: String, type: IOType): String {
      return when (type) {
        ENTER -> "${nickname}님이 들어왔습니다."
        LEAVE -> "${nickname}님이 나갔습니다."
        CHANGE -> "${nickname}님이 닉네임을 변경하셨습니다."
        else -> "Unknown Exception(${nickname})."
      }
    }
  }
}