package algorithms

class MatrixMath {

    fun addMatrices(a: Array<IntArray>, b: Array<IntArray>) : Array<IntArray> {
        val answer = Array(a.size) { IntArray(a[0].size) }
        for (x in a.indices) { //rows
            for (y in a[0].indices) { //columns
                answer[x][y] = a[x][y] + b[x][y]
            }
        }
        return answer
    }

    fun subtractMatrices(a: Array<IntArray>, b: Array<IntArray>) : Array<IntArray> {
        val answer = Array(a.size) { IntArray(a[0].size) }
        for (x in a.indices) { //rows
            for (y in a[0].indices) { //columns
                answer[x][y] = a[x][y] - b[x][y]
            }
        }
        return answer
    }

    fun scaleMatrix(a: Array<IntArray>, scalar: Int) : Array<IntArray> {
        val answer = Array(a.size) { IntArray(a[0].size) }
        for (x in a.indices) {
            for (y in a[0].indices) {
                answer[x][y] = a[x][y] * scalar
            }
        }
        return answer
    }

    fun multiplyMatrices(a: Array<IntArray>, b: Array<IntArray>) : Array<IntArray> {
        val answer = Array(a.size) { IntArray(b[0].size) }
        for (i in a.indices) { //rows
            for (j in b[0].indices) { //columns

                /* This is dot product multiplication
                Basically, to get the answer for the position at row i and column j
                iterate over each value in our current row, and multiply it by the necessary number in the second matrix
                then take the sum of these multiplications */
                var runningTotal = 0
                for (x in a[i].indices) {
                    println("multiply ${a[i][x]} * ${b[x][j]}")
                    runningTotal += a[i][x] * b[x][j]
                }
                println("Setting answer[$i][$j] = $runningTotal")
                answer[i][j] = runningTotal
            }
        }
        return answer
    }
}