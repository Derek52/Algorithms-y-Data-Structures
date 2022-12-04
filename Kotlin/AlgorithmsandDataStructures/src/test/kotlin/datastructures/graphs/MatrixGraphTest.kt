package datastructures.graphs

import org.junit.jupiter.api.Test

class MatrixGraphTest {

    @Test
    fun bfsTest() {
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

        graph.printGraph()
        graph.bfs()
    }
}