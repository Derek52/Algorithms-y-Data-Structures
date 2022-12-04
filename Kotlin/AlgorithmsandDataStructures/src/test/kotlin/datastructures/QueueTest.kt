package datastructures

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class QueueTest {

    @Test
    fun peekTest() {
        val queue = Queue<Int>(5)
        queue.insert(4)
        queue.insert(9)
        queue.insert(16)
        queue.peek().shouldBe(4)
        queue.remove()
        queue.peek().shouldBe(9)
    }

    @Test
    fun popTest() {
        val queue = Queue<Int>(5)
        queue.insert(4)
        queue.insert(9)
        queue.insert(16)
        queue.insert(25)
        queue.insert(36)
        queue.remove().shouldBe(4)
        queue.remove().shouldBe(9)
    }

    @Test
    fun putTest() {
        val queue = Queue<Int>(5)
        queue.insert(4)
        queue.peek().shouldBe(4)
        queue.remove()
        queue.insert(9)
        queue.peek().shouldBe(9)
    }

    @Test
    fun sizeTests() {
        val queue = Queue<Int>(5)
        queue.isEmpty().shouldBe(true)
        queue.isFull().shouldBe(false)
        queue.insert(4)
        queue.isEmpty().shouldBe(false)
        queue.isFull().shouldBe(false)
        queue.insert(9)
        queue.insert(16)
        queue.insert(25)
        queue.insert(36)
        queue.isFull().shouldBe(true)
    }
}