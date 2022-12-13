package algorithms

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MergeSortTest {

    @Test
    fun mergeSortTest() {
        val a = mutableListOf(117, 12, 93, 23, 24, 25, 22, 21, 87, 38, 94, 1)
        val sortedList = listOf(1, 12, 21, 22, 23, 24, 25, 38, 87, 93, 94, 117)

        val mergeSort = MergeSort()
        val mergedSortedList = mergeSort.mergeSort(a)

        for (x in sortedList.indices) {
            mergedSortedList[x].shouldBe(sortedList[x])
        }
    }
}
    /*@Test
    fun mergeTest() {
        val a = listOf(1, 3, 5, 7, 9)
        val b = listOf(2, 4, 6, 8, 10)

        val mergeSort = MergeSort()
        val c = mergeSort.sort(a, b)

        val d = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var i = 0
        for (x in d) {
            d[x].shouldBe(c[i])
        }
    }

    @Test
    fun mergeTest2() {
        val a = listOf(1, 3, 5, 7, 9)
        val b = listOf(2, 4, 6, 8, 10)

        val mergeSort = MergeSort()
        val c = mergeSort.sort(a, b)

        val d = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var i = 0
        for (x in d) {
            d[x].shouldBe(c[i])
        }
    }

    @Test
    fun mergeTest3() {
        val a = listOf(1, 3, 5, 7, 9)
        val b = listOf(2, 4, 6, 8, 10)

        val mergeSort = MergeSort()
        val c = mergeSort.sort(a, b)

        val d = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var i = 0
        for (x in d) {
            d[x].shouldBe(c[i])
        }
    }

    @Test
    fun mergeSortTest4() {
        val a = listOf(1, 3, 5, 7, 9)
        val b = listOf(2, 4, 6, 8, 10)

        val mergeSort = MergeSort()
        val c = mergeSort.sort(a, b)

        val d = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var i = 0
        for (x in d) {
            d[x].shouldBe(c[i])
        }
    }*/
