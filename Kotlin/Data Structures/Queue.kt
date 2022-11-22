class Queue<T>(val maxSize: Int){

	var itemCount = 0
	var front = 0
	var rear = -1

	val qList = mutableListOf<T>()


	fun insert(item: T) {
		if (rear == maxSize - 1) {
			rear = -1
		}
		rear++
		qList.add(rear, item)
		itemCount++
	}

	fun remove() : T {
		val item = qList[front]
		front++
		if (front == maxSize) {
			front = 0
		}
		itemCount--
		return item
	}

	fun peek() : T {
		return qList[front]
	}

	fun isFull() : Boolean {
		if (itemCount == maxSize) {
			return true
		} else {
			return false
		}
	}

	fun isEmpty() : Boolean {
		if (itemCount == 0) {
			return true
		} else {
			return false
		}
	}
	
	fun size() : Int {
		return itemCount
	}

}

fun main() {
	val queue = Queue<Int>(10)

	println("queue.isEmpty() should be true: is ${queue.isEmpty()}")
	println("queue.isFull() should be false: is ${queue.isFull()}")
	
	for (i in 0..9) {
		queue.insert(i)
	}

	println("queue.isEmpty() should be false: is ${queue.isEmpty()}")
	println("queue.isFull() should be true: is ${queue.isFull()}")

	println("queue.peek() should be 0: is ${queue.peek()}")

	for (i in 0..2) {
		queue.remove()
	}

	println("queue.peek() should be 3: is ${queue.peek()}")
	println("queue.size() should be 7: is ${queue.size()}")
}
