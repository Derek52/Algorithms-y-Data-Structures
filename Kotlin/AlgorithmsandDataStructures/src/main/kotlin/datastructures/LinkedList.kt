package datastructures

class LinkedList {

    var head: Node? = null
    var currentNode: Node? = null

    fun add(item : Int) {
        if (head == null) {
            head = Node(item)
            currentNode = head
            println("Adding to head")
        } else {
            val newNode = Node(item)
            currentNode!!.next = newNode
            currentNode = newNode
            println("Adding to currentNode")
        }
    }

    fun peek() : Node? {
        return currentNode
    }

    fun remove(item: Int) : Boolean{
        head?.let {h ->
            var nodeToCheck = h
            if (nodeToCheck.item == item) {
                head = h.next
                return true
            }
            var previousNode = h
            while(nodeToCheck.next != null) {
                if (nodeToCheck.item == item) {
                    previousNode.next = nodeToCheck.next
                    return true
                }
                previousNode = nodeToCheck
                nodeToCheck = nodeToCheck.next!!

            }
            if (nodeToCheck.item == item) {
                currentNode = previousNode
                currentNode!!.next = null
                return true
            }

        }
        return false
    }
}

class Node(val item: Int, var next: Node? = null)