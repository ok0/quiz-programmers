package e.example

class P01 {
  fun solution(v: Array<IntArray>): IntArray {
    val x = hashMapOf<Int, Int>()
    val y = hashMapOf<Int, Int>()

    v.forEach { arr ->
      if (x.containsKey(arr[0])) {
        x[arr[0]] = x[arr[0]]!! + 1
      } else {
        x[arr[0]] = 1
      }

      if (y.containsKey(arr[1])) {
        y[arr[1]] = y[arr[1]]!! + 1
      } else {
        y[arr[1]] = 1
      }
    }

    return intArrayOf(
      x.filter { it.value == 1 }.keys.first(),
      y.filter { it.value == 1 }.keys.first()
    )
  }
}