package algorithms

class BubbleSort {


    var swaps = 0

    fun sort(array: IntArray) : IntArray {

        for (i in array.size - 1 downTo 2) {
            for (j in 0 until i) {
                val a = array[j]
                val b = array[j+1]
                if (a > b) {
                    swap(j, j+1, array)
                    swaps++
                }
            }
        }

        return array
    }

    fun swap(a : Int, b : Int, array: IntArray){
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
    }
}