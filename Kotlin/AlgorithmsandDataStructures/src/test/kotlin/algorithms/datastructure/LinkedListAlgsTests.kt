package algorithms.datastructure

import datastructures.LinkedList
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LinkedListAlgsTests {

    @Test
    fun reverseTest() {
        val linkedList = LinkedList()

        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)
        linkedList.add(4)
        linkedList.add(5)

        val linkedListAlgs = LinkedListAlgs()

        //linkedList.printListReversed(linkedList.head)
        var currentOriginalNode = linkedList.head!!.copy()

        linkedList.reverse(linkedList.head!!)
        println("Printing list")
        linkedList.printList()
        var currentReverseNode = linkedList.head


        //val llHead = linkedList.head
        //var currentReverseNode = linkedListAlgs.reverse(linkedList.head!!.copy())

        var current = 5
        while (currentReverseNode!!.next != null) {
            currentReverseNode!!.item.shouldBe(current)
            currentReverseNode = currentReverseNode.next
            current--
        }
    }
}