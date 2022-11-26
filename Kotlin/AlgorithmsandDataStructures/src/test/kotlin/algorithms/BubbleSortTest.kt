package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BubbleSortTest {

    @Test
    fun sortTest() {
        val bubbleSorter = BubbleSort()

        val result = bubbleSorter.sort(intArrayOf(34, 17, 3, 148, 11))

        assertEquals(true, result.contentEquals(intArrayOf(3, 11, 17, 34, 148)))
    }
}