package datastructures.linkedlist

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun addItemsTest() {
        val linkedList = LinkedList()

        linkedList.peek().shouldBe(null)
        linkedList.add(1)
        linkedList.peek()!!.item.shouldBe(1)
        linkedList.add(2)
        linkedList.peek()!!.item.shouldBe(2)
        linkedList.add(3)
        linkedList.peek()!!.item.shouldBe(3)
    }

    @Test
    fun removeHeadTest() {
        val linkedList = LinkedList()

        linkedList.add(1)
        linkedList.peek()!!.item.shouldBe(1)
        linkedList.add(2)

        linkedList.remove(1)
        linkedList.peek()!!.item.shouldBe(2)
    }

    @Test
    fun removeLastItemTest() {
        val linkedList = LinkedList()

        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)

        linkedList.peek()!!.item.shouldBe(3)
        linkedList.remove(3)
        linkedList.peek()!!.item.shouldBe(2)
    }

    @Test
    fun reverseTest() {
        val linkedList = LinkedList()

        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)
        linkedList.add(4)
        linkedList.add(5)


        val secondList = LinkedList()
        secondList.add(5)
        secondList.add(4)
        secondList.add(3)
        secondList.add(2)
        secondList.add(1)

        var currentTestNode = secondList.head

        linkedList.reverse(linkedList.head!!)
        var currentReverseNode = linkedList.head


        while (currentReverseNode!!.next != null) {
            currentReverseNode.item.shouldBe(currentTestNode!!.item)
            currentReverseNode = currentReverseNode.next
            currentTestNode = currentTestNode.next
        }
    }

    @Test
    fun bigReverseTest() {
        val linkedList = LinkedList()

        for (i in 1..5000) {
            linkedList.add(i)
        }

        linkedList.reverse(linkedList.head!!)
    }


}