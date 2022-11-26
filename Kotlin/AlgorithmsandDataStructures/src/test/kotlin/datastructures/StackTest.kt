package datastructures

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun peekTest() {
        val stack = Stack<Int>(5)
        stack.put(4)
        stack.put(9)
        stack.put(16)
        stack.put(25)
        stack.peek().shouldBe(25)
        stack.put(36)
        stack.peek().shouldBe(36)
    }

    @Test
    fun popTest() {
        val stack = Stack<Int>(5)
        stack.put(4)
        stack.put(9)
        stack.put(16)
        stack.put(25)
        stack.put(36)
        stack.pop().shouldBe(36)
        stack.pop().shouldBe(25)
    }

    @Test
    fun putTest() {
        val stack = Stack<Int>(5)
        stack.put(4)
        stack.peek().shouldBe(4)
        stack.put(9)
        stack.peek().shouldBe(9)
        stack.put(16)
        stack.peek().shouldBe(16)
    }

    @Test
    fun sizeTests() {
        val stack = Stack<Int>(5)
        stack.isEmpty().shouldBe(true)
        stack.isFull().shouldBe(false)
        stack.put(4)
        stack.isEmpty().shouldBe(false)
        stack.isFull().shouldBe(false)
        stack.put(9)
        stack.put(16)
        stack.size().shouldBe(3)
        stack.put(25)
        stack.put(36)
        stack.isFull().shouldBe(true)
    }
}