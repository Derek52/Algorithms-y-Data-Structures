package datastructures.linkedlist

class DoublyLinkedList {

    var head: DualNode? = null
    var tail: DualNode? = null

    fun addFirst(item : Int) {
        val newNode = DualNode(item)
        if (isEmpty()) {
            tail = newNode
        }
        newNode.next = head
        head = newNode
    }

    fun addLast(item: Int) {
        val newNode = DualNode(item)
        if (isEmpty()) {
            head = newNode
        } else {
            tail!!.next = newNode
        }
        tail = newNode
    }

    fun peekHead() : DualNode? {
        return head
    }

    fun peekTail() : DualNode? {
        return tail
    }

    fun remove(item: Int) : Boolean {
        head?.let { h ->
            var nodeToCheck = h
            var previous = h

            while(nodeToCheck.next != null) {
                println("In While loop")
                if (nodeToCheck.item == item) {
                    if (nodeToCheck == h) {
                        head = h.next
                    } else if (nodeToCheck == tail) {
                        tail = tail!!.previous
                    } else {
                        previous.next = nodeToCheck.next
                        nodeToCheck.previous = previous
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

    fun removeHead() : DualNode? {
        head = head!!.next
        return head
    }

    fun removeTail() : DualNode? {
        val old = tail
        val node = tail!!.previous
        node!!.next = null
        tail = node
        return old
    }

    fun isEmpty() : Boolean {
        return head == null
    }
}

class DualNode(val item: Int, var previous: DualNode? = null, var next: DualNode? = null)