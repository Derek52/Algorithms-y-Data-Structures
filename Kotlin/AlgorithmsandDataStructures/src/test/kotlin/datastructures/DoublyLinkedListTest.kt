package datastructures

import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class DoublyLinkedListTest {

    @Test
    fun addItemsTest() {
        val linkedList = DoublyLinkedList()

        linkedList.peekHead().shouldBe(null)
        linkedList.add(1)
        linkedList.peekTail()!!.item.shouldBe(1)
        linkedList.add(2)
        linkedList.peekTail()!!.item.shouldBe(2)
        linkedList.add(3)
        linkedList.peekTail()!!.item.shouldBe(3)
    }


    @Test
    fun removeTest() {
        val linkedList = DoublyLinkedList()

        linkedList.add(2)
        linkedList.add(4)
        linkedList.add(8)
        linkedList.add(16)
        linkedList.add(32)

        val removed = linkedList.remove(8)
        removed.shouldBeTrue()
    }

    @Test
    fun removeHeadTest() {
        val linkedList = DoublyLinkedList()

        linkedList.add(1)
        linkedList.peekHead()!!.item.shouldBe(1)
        linkedList.add(2)

        linkedList.removeHead()
        linkedList.peekHead()!!.item.shouldBe(2)
    }

    @Test
    fun removeTailTest() {
        val linkedList = DoublyLinkedList()

        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)
        linkedList.removeTail()
        linkedList.peekTail()!!.item.shouldBe(2)
    }

    @Test
    fun removeLastItemTest() {
        val linkedList = DoublyLinkedList()

        linkedList.add(1)
        linkedList.add(2)
        linkedList.add(3)

        linkedList.tail!!.item.shouldBe(3)
        linkedList.remove(3)
        linkedList.tail!!.item.shouldBe(2)
    }
}