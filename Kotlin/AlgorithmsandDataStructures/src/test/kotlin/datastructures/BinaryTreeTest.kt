package datastructures

import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class BinaryTreeTest {

    @Test
    fun treeTests() {
        val binaryTree = BinaryTree()

        binaryTree.isEmpty().shouldBeTrue()

        binaryTree.add(5)
        binaryTree.isEmpty().shouldBeFalse()
        binaryTree.add(12)
        binaryTree.isPresent(12).shouldBeTrue()
        binaryTree.min().shouldBe(5)
        binaryTree.add(3)
        binaryTree.min().shouldBe(3)
        binaryTree.max().shouldBe(12)
        binaryTree.add(143)
        binaryTree.max().shouldBe(143)
        binaryTree.isPresent(143).shouldBeTrue()
        binaryTree.add(37)
        binaryTree.add(21)
        binaryTree.add(19)



    }
}