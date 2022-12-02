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

    fun printList() {
        head?.let {
            var currentNode = head
            var count = 0
            while(currentNode != null) {
                println("$count = ${currentNode.item}")
                currentNode = currentNode.next
                count++
            }
        }
    }

    fun printListReversed(node: Node?) {
        if (node == null) {
            return
        }
        printListReversed(node.next)
        println(node.item)
    }

    fun reverse(node: Node) {
        if (node.next == null) {
            head = node
            return
        }
        //val newHead : Node? = reverse(node.next!!)!!
        reverse(node.next!!)
        node.next!!.next = node
        node.next = null
        //return newHead
    }

}

data class Node(val item: Int, var next: Node? = null)