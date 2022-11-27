package algorithms

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MatrixMathTest {

    @Test
    fun addMatricesTest() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(3, 4, 5),
            intArrayOf(7, 9, 2)
        )

        val b = arrayOf(intArrayOf(6, 8, 1),
            intArrayOf(4, 0, 2),
            intArrayOf(6, 3, 7)
        )

        val expectedResult = arrayOf(intArrayOf(8, 11, 5),
            intArrayOf(7, 4, 7),
            intArrayOf(13, 12, 9)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.addMatrices(a, b)
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun subMatricesTest() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(3, 4, 5),
            intArrayOf(7, 9, 2)
        )

        val b = arrayOf(intArrayOf(6, 8, 1),
            intArrayOf(4, 0, 2),
            intArrayOf(6, 3, 7)
        )

        val expectedResult = arrayOf(intArrayOf(4, 5, -3),
            intArrayOf(1, -4, -3),
            intArrayOf(-1, -6, 5)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.subtractMatrices(b, a)
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun scaleMatrix() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(3, 4, 0),
            intArrayOf(7, 9, 2)
        )

        val scalar = 4

        val expectedResult = arrayOf(intArrayOf(8, 12, 16),
            intArrayOf(12, 16, 0),
            intArrayOf(28, 36, 8)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.scaleMatrix(a, scalar)
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun multiplyMatricesTest() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(3, 4, 5),
            intArrayOf(7, 9, 2)
        )

        val b = arrayOf(intArrayOf(6, 8, 1),
            intArrayOf(4, 0, 2),
            intArrayOf(6, 3, 7)
        )

        val expectedResult = arrayOf(intArrayOf(48, 28, 36),
            intArrayOf(64, 39, 46),
            intArrayOf(90, 62, 39)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.multiplyMatrices(a, b)
        println(result.toString())
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun multiplyUnEvenMatricesTest() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(7, 9, 2)
        )

        val b = arrayOf(intArrayOf(6, 8),
            intArrayOf(4, 0),
            intArrayOf(6, 3)
        )

        val expectedResult = arrayOf(intArrayOf(48, 28),
            intArrayOf(90, 62)
        )

        val matrixMath = MatrixMath()

        /*val result = matrixMath.multiplyMatrices(a, b)
        result.contentDeepEquals(expectedResult).shouldBe(true)*/

        val result2 = matrixMath.multiplyMatrices(b, a)
        result2.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun multiplyUnEvenMatricesTest2() {
        val a = arrayOf(intArrayOf(2, 3, 4),
            intArrayOf(7, 9, 2)
        )

        val b = arrayOf(intArrayOf(6, 8),
            intArrayOf(4, 0),
            intArrayOf(6, 3)
        )

        val expectedResult = arrayOf(intArrayOf(68, 90, 40),
            intArrayOf(8, 12, 16),
            intArrayOf(33, 45, 30)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.multiplyMatrices(b, a)
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

    @Test
    fun multiplyUnEvenMatricesTest3() {
        val a = arrayOf(intArrayOf(9, 7, 3),
            intArrayOf(1, 2, 9)
        )

        val b = arrayOf(intArrayOf(7, 0, 2, 8),
            intArrayOf(4, 1, 1, 3),
            intArrayOf(9, 2, 5, 6)
        )

        val expectedResult = arrayOf(intArrayOf(118, 13, 40, 111),
            intArrayOf(96, 20, 49, 68)
        )

        val matrixMath = MatrixMath()

        val result = matrixMath.multiplyMatrices(a, b)
        result.contentDeepEquals(expectedResult).shouldBe(true)
    }

}