val array = intArrayOf(77, 23, 11, 145, 7, 48, 17)

var swaps = 0

fun main() {
	//print initialArray
	println(array.joinToString(", "))

	for (i in 0..array.size - 1) {
		var smallestValue = array[i]
		var smallestIndex = i
		for (j in i..array.size - 1) {
			val a = array[j]
			if (smallestValue > a) {
				smallestIndex = j
				smallestValue = array[j]
			}
		}
		if ( i != smallestIndex) {
			swap(i, smallestIndex)
			swaps++
		}
	}

	//print sorted array
	println(array.joinToString(", "))
	println("Array sorted in $swaps swaps")
}

fun swap(a : Int, b : Int) {
//	println("Swapping ${array[a]} and ${array[b]}")
	val temp = array[a]
	array[a] = array[b]
	array[b] = temp
}
