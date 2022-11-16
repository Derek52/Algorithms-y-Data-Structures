class Stack(val maxSize : Int) {
	val innerArray : IntArray

	var top = 0
	var currentSize : Int = 0

	init {
		innerArray = IntArray(maxSize)
	}

	fun put(item : Int) {
		innerArray[top] = item
		top++
		currentSize++
	}

	fun pop() : Int {
		val item = innerArray[top-1]
		innerArray[top-1] = 0
		top--
		currentSize--
		return item
	}

	fun peek() : Int {
		return innerArray[top-1]
	}

	fun isFull() : Boolean {
		return (currentSize == maxSize - 1)
	}

	fun isEmpty() : Boolean {
		return currentSize == 0
	}

	fun size() : Int {
		return currentSize
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
	println("Stack has ${stack.currentSize} elements")
	stack.pop()
	stack.pop()
	stack.pop()
	println(stack.innerArray.joinToString(", "))
}
