class Stack<T>(val maxSize : Int) {

	var top = 0
	var currentSize : Int = 0

	val innerArray = mutableListOf<T>()

	fun put(item : T) {
		innerArray.add(top, item)
		top++
		currentSize++
	}

	fun pop() : T {
		val item = innerArray[top-1]
		innerArray.removeAt(top - 1)
		top--
		currentSize--
		return item
	}

	fun peek() : T {
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
	val stack = Stack<Int>(5)
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
