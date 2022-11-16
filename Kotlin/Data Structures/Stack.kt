class Stack(val size : Int) {
	val innerArray : IntArray

	var top = 0

	init {
		innerArray = IntArray(size)
	}

	fun put(item : Int) {
		innerArray[top] = item
		top++
	}

	fun pop() : Int {
		val item = innerArray[top-1]
		innerArray[top-1] = 0
		top--
		return item
	}

	fun peek() : Int {
		return innerArray[top-1]
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
