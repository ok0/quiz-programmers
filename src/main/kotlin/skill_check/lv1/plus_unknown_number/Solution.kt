package skill_check.lv1.plus_unknown_number

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/86051
*
* */
class Solution {
  fun solution(numbers: IntArray): Int = (0..9).filter { !numbers.contains(it) }.sum()
}