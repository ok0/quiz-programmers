package challenges.lv3.priority_queue

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42628
 *
 *
 * */
class Solution {
  fun solution(operations: Array<String>): IntArray {
    val p = PQ(ArrayList<Int>())
    operations.forEach { o ->
      val v = o.split(" ")
      if (v[0] == "I") {
        if (v[1][0] == '-') {
          p.add(v[1].substring(1).toInt() * -1)
        } else {
          p.add(v[1].toInt())
        }
      } else if (v[0] == "D" && v[1] == "1") {
        p.deleteLast()
      } else if (v[0] == "D" && v[1] == "-1") {
        p.deleteFirst()
      }
    }

    return intArrayOf(p.max(), p.min())
  }
}

class PQ(val q: ArrayList<Int>) {
  fun add(v: Int) {
    if (q.isEmpty()) {
      q.add(v)
    } else {
      val idx = q.indexOfFirst { v < it }
      if (idx == -1) {
        q.add(v)
      } else {
        q.add(idx, v)
      }
    }
  }

  fun deleteFirst() = q.removeFirstOrNull()

  fun deleteLast() = q.removeLastOrNull()

  fun min(): Int {
    return when (q.isEmpty()) {
      true -> 0
      else -> q.first()
    }
  }

  fun max(): Int {
    return when (q.isEmpty()) {
      true -> 0
      else -> q.last()
    }
  }
}