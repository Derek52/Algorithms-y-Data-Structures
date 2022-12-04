package datastructures.graphs

import datastructures.Queue
import datastructures.Stack

fun main() {
    val graph = MatrixGraph()

    graph.addVertex('A')
    graph.addVertex('B')
    graph.addVertex('C')
    graph.addVertex('D')
    graph.addVertex('E')

    graph.addEdge(0, 1)
    graph.addEdge(1, 2)
    graph.addEdge(0, 3)
    graph.addEdge(3, 4)

    graph.bfs()
    graph.dfs()
}
class MatrixGraph {

    val vertexList = Array<MatrixVertex>(10) { MatrixVertex('Z') }

    val adjMat = Array<IntArray>(5) { IntArray(5) { 0 } }
    var vertexCount = 0

    fun addVertex(label: Char) {
        vertexList[vertexCount] = MatrixVertex(label)
        vertexCount++
    }

    fun addEdge(start: Int, end: Int) {
        adjMat[start][end] = 1
        adjMat[end][start] = 1
    }

    fun displayVertex(v: Int) {
        println(vertexList[v].label)
    }

    fun bfs() {
        println("Initiate BFS")
        vertexList[0].visited = true
        displayVertex(0)
        var queue = Queue<Int>(vertexCount)
        queue.insert(0)

        while (queue.itemCount > 0) {
            val activeVertex = queue.remove()

            var neighbors = getUnvisitedNeighbors(activeVertex)
            while(neighbors.isNotEmpty()) {
                vertexList[neighbors.first()].visited = true
                displayVertex(neighbors.first())
                queue.insert(neighbors.first())
                neighbors = getUnvisitedNeighbors(activeVertex)
            }
        }

        for (vertex in vertexList) {
            vertex.visited = false
        }
    }

    fun dfs() {
        println("Initiate DFS")
        vertexList[0].visited = true
        displayVertex(0)
        val stack = Stack<Int>(vertexCount)
        stack.put(0)

        while (stack.isEmpty() == false) {
            val activeVertex = stack.peek()

            var neighbors = getUnvisitedNeighbors(activeVertex)

            if (neighbors.isEmpty()) {
                stack.pop()
            } else {
                vertexList[neighbors.first()].visited = true
                displayVertex(neighbors.first())
                stack.put(neighbors.first())
            }
        }

        for (vertex in vertexList) {
            vertex.visited = false
        }
    }

    fun printGraph() {
        for (array in adjMat) {
            for (item in array) {
                print(" $item ")
            }
        }
    }
    fun getUnvisitedNeighbors(v: Int) : List<Int> {
        val neighbors = mutableListOf<Int>()
        for (i in 0 until vertexCount) {
            if(adjMat[v][i]==1 && !vertexList[i].visited) {
                neighbors.add(i)

            }
        }
        return neighbors
    }
}

class MatrixVertex(val label: Char, var visited: Boolean = false)