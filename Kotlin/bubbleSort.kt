//import kotlin.random.Random

val array = intArrayOf(77, 23, 11, 145, 7, 48, 17)

var swaps = 0

fun main() {
	//print initialArray
	println(array.joinToString(", "))

	for (i in array.size - 1 downTo 2) {
		for (j in 0..i-1) {
			val a = array[j]
			val b = array[j+1]
			if(a > b) {
				swap(j, j+1)
				swaps++
			}
		}
	}

	//print sorted array
	println(array.joinToString(", "))
	println("Array sorted in $swaps swaps")
}

fun swap(a : Int, b : Int) {
	val temp = array[a]
	array[a] = array[b]
	array[b] = temp
}
