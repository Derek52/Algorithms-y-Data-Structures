package datastructures.graphs

import datastructures.graphs.Graph
import datastructures.graphs.Vertex
import org.junit.jupiter.api.Test

class GraphTest {

    @Test
    fun bfsTest() {
        val graph = Graph()

        val vertexList = ArrayList<Vertex>()
        vertexList.add(Vertex("Derek"))
        vertexList.add(Vertex("Tyler"))
        vertexList.add(Vertex("Bri"))
        vertexList.add(Vertex("Kaitlyn"))
        vertexList.add(Vertex("Danny"))


        for (vertex in vertexList) {
            graph.addVertex(vertex)
        }

        graph.addEdge(vertexList[0], vertexList[1])
        graph.addEdge(vertexList[0], vertexList[3])
        graph.addEdge(vertexList[1], vertexList[2])
        graph.addEdge(vertexList[3], vertexList[4])

        graph.bfs()
    }

    @Test
    fun dfsTest() {

    }
}