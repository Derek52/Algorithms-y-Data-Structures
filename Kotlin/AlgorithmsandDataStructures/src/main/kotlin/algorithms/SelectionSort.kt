package algorithms

class SelectionSort {

	fun sort(array: IntArray) : IntArray {
		for (i in array.indices) {
			var lowestValue = array[i]
			var lowestValueIndex = i
			for (j in i until array.size) {
				if (array[j] < lowestValue) {
					lowestValue = array[j]
					lowestValueIndex = j
				}
			}
			if( i != lowestValueIndex) {
				swap(i, lowestValueIndex, array)
			}
		}

		return array
	}

	fun swap(a: Int, b: Int, array: IntArray) {
		val temp = array[a]
		array[a] = array[b]
		array[b] = temp
	}
}
