package datastructures

class DoublyLinkedList {

    var head: DualNode? = null
    var tail: DualNode? = null

    fun add(item : Int) {
        if (head == null) {
            head = DualNode(item)
            tail = head
            println("Adding to head")
        } else {
            val newNode = DualNode(item)
            newNode.previous = tail
            tail!!.next = newNode
            tail = newNode
            println("Adding to currentNode")
        }
    }

    fun peekHead() : DualNode? {
        return head
    }

    fun peekTail() : DualNode? {
        return tail
    }

    fun remove(item: Int) : Boolean{
        head?.let {h ->
            var nodeToCheck = h
            if (nodeToCheck.item == item) {
                head = h.next
                head!!.previous = null
                return true
            }
            var previousNode = h
            while(nodeToCheck.next != null) {
                if (nodeToCheck.item == item) {
                    previousNode.next = nodeToCheck.next
                    nodeToCheck.next!!.previous = previousNode
                    return true
                }
                previousNode = nodeToCheck
                nodeToCheck = nodeToCheck.next!!

            }
            if (nodeToCheck.item == item) {
                tail = previousNode
                tail!!.next = null
                return true
            }

        }
        return false
    }

    fun removeHead() : DualNode? {
        head = head!!.next
        return head
    }

    fun removeTail() : DualNode? {
        val previousNode = tail!!.previous
        previousNode!!.next = null
        val node = tail
        tail = previousNode
        return node
    }
}

class DualNode(val item: Int, var previous: DualNode? = null, var next: DualNode? = null)