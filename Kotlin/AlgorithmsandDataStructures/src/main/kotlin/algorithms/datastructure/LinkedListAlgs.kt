package algorithms.datastructure

import datastructures.Node

class LinkedListAlgs {

    var head : Node? = null

    fun reverse(node: Node) : Node? {
        if (node.next == null) {
            head = node.copy()
            return null
        }
        val newHead : Node? = reverse(node.next!!)!!

        node.next!!.next = node
        node.next = null
        return newHead
    }
}