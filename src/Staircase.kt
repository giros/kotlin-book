// https://www.hackerrank.com/challenges/staircase/problem

fun stairCase(n: Int) {
    if (n < 0 || n > 100) return

    for (i in 1..n) {
        for (j in 1..n-i) {
            print(" ")
        }

        for (j in 1..i-1) {
            print("#")
        }

        println("#")
    }
}

fun main() {
    stairCase(6)
}