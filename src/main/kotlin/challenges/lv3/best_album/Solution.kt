package challenges.lv3.best_album

/**
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/42579
 *
 *
 *
 * */
class Solution {
  fun solution(genres: Array<String>, plays: IntArray): IntArray {
    return genres.indices.groupBy { genres[it] }
      .toList()
      .sortedByDescending {
        it.second.sumOf { song ->
          plays[song]
        }
      }
      .map { genre ->
        genre.second.sortedByDescending { song ->
          plays[song]
        }.take(2)
      }
      .flatten().toList()
      .toIntArray()
  }
}