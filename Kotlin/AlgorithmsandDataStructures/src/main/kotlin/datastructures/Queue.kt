package datastructures

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