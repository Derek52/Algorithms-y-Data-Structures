package datastructures.graphs

class Graph {
    var vertexCount = 0
    val vertexList = mutableListOf<Vertex>()
    val adjacencyList = HashMap<Vertex, ArrayList<Vertex>>()
    //val adjacencyList = mutableListOf<MutableList<Vertex>>()

    fun addVertex(vertex: Vertex) {
        vertexList.add(vertex)
        adjacencyList.computeIfAbsent(vertex) {ArrayList()}
        vertexCount++
    }

    fun addEdge(source: Vertex, destination: Vertex) {
        adjacencyList[source]!!.add(destination)
        adjacencyList[destination]!!.add(source)

        //adjacencyList[source].add(vertexList[destination])
        //adjacencyList[destination].add(vertexList[source])
    }

    fun printVertex(v: Int) {
        println(vertexList[v].person)
    }

    fun bfs() {
        vertexList[0].visited = true
        vertexList[0].printVert()

        val queue = datastructures.Queue<Vertex>(30)
        queue.insert(vertexList[0])

        while (queue.isEmpty() != null) {
            val currentNode = queue.remove()
            println("Current Node = ${currentNode.person}")
            adjacencyList[currentNode]?.let {
                for (child in adjacencyList[currentNode]!!) {
                    child.printVert()
                    child.visited = true
                    queue.insert(child)
                }
            }
        }

        for (vertex in vertexList) {
            vertex.visited = false
        }

    }
}

data class Vertex(val person: String, var visited: Boolean = false) {
    fun printVert() {
        println(person)
    }
}
