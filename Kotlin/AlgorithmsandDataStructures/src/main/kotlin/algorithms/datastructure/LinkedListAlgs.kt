package algorithms.datastructure

import datastructures.linkedlist.LinkedList
import datastructures.linkedlist.Node

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

    fun mergeLists(list1: LinkedList, list2: LinkedList) : Node? {
        if (list1 == null && list2 == null) {
            return null
        } else if (list1 == null) {
            return list2.head
        } else if (list2 == null) {
            return list1.head
        }

        if (list1.head!!.item >= list2.head!!.item) {
            return merge(list1.head!!, list2.head!!)
        } else {
            return merge(list2.head!!, list1.head!!)
        }
    }

    fun merge(left: Node, right: Node) : Node{
        var lActive = left
        var rActive = right

        while(true) {
            println("lActive.next = ${lActive.next}")
            if (lActive.next == null) {
                lActive.next = rActive
                return left
            } else if(rActive.next == null) {
                lActive.next = rActive
                return left
            }

            while(lActive.next!!.item <= rActive.item) {
                lActive = lActive.next!!
            }

            println("Left: ${lActive.item}   Right: ${rActive.item}")
            val lRightHalf = lActive.next
            lActive.next = rActive
            lActive = lActive.next!!
            lActive.next = lRightHalf
            rActive = rActive.next!!
        }
    }
}