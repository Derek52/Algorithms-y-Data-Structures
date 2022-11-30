package datastructures

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
}