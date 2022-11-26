package datastructures


class Stack<T>(val maxSize : Int) {

    var top = 0
    var currentSize : Int = 0

    val sList = mutableListOf<T>()

    fun put(item: T) {
        sList.add(top, item)
        top++
        currentSize++
    }

    fun pop() : T {
        val item = sList[top - 1]
        sList.removeAt(top -1)
        top--
        currentSize--
        return item
    }

    fun peek() : T {
        return sList[top - 1]
    }

    fun isFull() : Boolean {
        return (currentSize == maxSize)
    }

    fun isEmpty() : Boolean {
        return currentSize == 0
    }

    fun size() : Int {
        return currentSize
    }
}