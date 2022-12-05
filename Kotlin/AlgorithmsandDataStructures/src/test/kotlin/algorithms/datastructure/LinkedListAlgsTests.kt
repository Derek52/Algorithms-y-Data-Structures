package algorithms.datastructure

import datastructures.linkedlist.LinkedList
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

    @Test
    fun mergeSortedListsTest() {
        val a = arrayOf(4, 2, 1)
        val b = arrayOf(4, 3, 1)

        val linkedListA = LinkedList()
        val linkedListB = LinkedList()

        for (x in a) {
            linkedListA.add(x)
        }

        for (x in b) {
            linkedListB.add(x)
        }

        linkedListA.printList()
        val linkedListAlgs = LinkedListAlgs()

        val mergedHead = linkedListAlgs.mergeLists(linkedListA, linkedListB)

        val mergedList = arrayOf(1,1, 2, 3, 4, 4)
        var i = 0
        var activeMergedHead = mergedHead
        while(activeMergedHead!!.next != null) {
            println("mergeHead = ${activeMergedHead.item} === mergedList: ${mergedList[i]}")
            activeMergedHead.item.shouldBe(mergedList[i])
            i++
            activeMergedHead = activeMergedHead.next
        }
    }
}