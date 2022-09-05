package e.example

class P02 {
  fun solution(n: String) {
    for (line in 1 .. n.toInt()) {
      for (star in 0 until line) {
        println("*")
      }
    }
  }
}