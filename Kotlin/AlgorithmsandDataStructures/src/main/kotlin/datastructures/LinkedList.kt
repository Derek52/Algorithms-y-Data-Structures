package datastructures

class LinkedList {

    var head: Node? = null

    fun add(item : Int) {
        val node = Node(item)
        node.next = head
        head = node
    }

    fun peek() : Node? {
        return head
    }

    fun remove(item: Int) : Boolean{
        head?.let {h ->
            var nodeToCheck = h
            var previous = h

            while(nodeToCheck.next != null) {
                if (nodeToCheck.item == item) {
                    if (nodeToCheck == h) {
                        head = h.next
                    } else {
                        previous.next = nodeToCheck.next
                    }
                    return true
                } else {
                    previous = nodeToCheck
                    nodeToCheck = nodeToCheck.next!!
                }
            }
        }
        return false
    }
}

class Node(val item: Int, var next: Node? = null)