package algorithms

class MergeSort {

    fun mergeSort(a: List<Int>) : List<Int> {
        if (a.size == 1) {
            return a
        }
        return mergeSort(a.subList(0, a.size/2)) + mergeSort(a.subList(a.size/2+1, a.size-1))
    }

    fun merge(a: List<Int>) : List<Int> {
        return a
    }
}