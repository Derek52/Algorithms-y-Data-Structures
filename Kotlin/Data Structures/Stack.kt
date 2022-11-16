class Stack(val size : Int) {
	val innerArray : IntArray

	var position = 0

	init {
		innerArray = IntArray(size)
	}

	fun put(item : Int) {
		innerArray[position] = item
		position++
	}

	fun pop() : Int {
		val item = innerArray[position-1]
		innerArray[position-1] = 0
		position--
		return item
	}

	fun peek() : Int {
		return innerArray[position-1]
	}
}

fun main() {
	val stack = Stack(5)
	stack.put(16)
	stack.put(25)
	stack.put(36)
	stack.put(49)
	stack.put(64)
	println(stack.innerArray.joinToString(", "))
	stack.pop()
	stack.pop()
	stack.pop()
	println(stack.innerArray.joinToString(", "))
}
