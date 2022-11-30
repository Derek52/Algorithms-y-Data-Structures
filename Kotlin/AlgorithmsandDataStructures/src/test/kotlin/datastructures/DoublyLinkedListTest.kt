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
        linkedList.addLast(1)
        linkedList.peekTail()!!.item.shouldBe(1)
        linkedList.addLast(2)
        linkedList.peekTail()!!.item.shouldBe(2)
        linkedList.addLast(3)
        linkedList.peekTail()!!.item.shouldBe(3)
    }


    @Test
    fun removeTest() {
        val linkedList = DoublyLinkedList()

        linkedList.addLast(2)
        linkedList.addLast(4)
        linkedList.addLast(8)
        linkedList.addLast(16)
        linkedList.addLast(32)

        val removed = linkedList.remove(8)
        removed.shouldBeTrue()
    }

    @Test
    fun removeHeadTest() {
        val linkedList = DoublyLinkedList()

        linkedList.addLast(1)
        linkedList.peekHead()!!.item.shouldBe(1)
        linkedList.addLast(2)

        linkedList.removeHead()
        linkedList.peekHead()!!.item.shouldBe(2)
    }

    @Test
    fun removeTailTest() {
        val linkedList = DoublyLinkedList()

        linkedList.addLast(1)
        linkedList.addLast(2)
        linkedList.addLast(3)
        linkedList.removeTail()
        linkedList.peekTail()!!.item.shouldBe(2)
    }

    @Test
    fun removeLastItemTest() {
        val linkedList = DoublyLinkedList()

        linkedList.addFirst(1)
        linkedList.addFirst(2)
        linkedList.addFirst(3)

        linkedList.tail!!.item.shouldBe(1)
        linkedList.remove(3)
        linkedList.tail!!.item.shouldBe(2)
    }
}