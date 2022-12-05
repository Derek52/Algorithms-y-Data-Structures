package datastructures.linkedlist


//Implementation of a cache that clears the least recently used item when capacity is exceeded. Leetcode problem found here: https://leetcode.com/problems/lru-cache/
class LRUCache(val capacity: Int) {

    var count = 0
    val cacheMap = HashMap<Int, LRUNode>()
    val leastNode = LRUNode(-1, value=-1)
    val mostNode = LRUNode(-2, value=-2)

    init {
        leastNode.next = mostNode
        mostNode.prev = leastNode
    }

    fun get(key: Int) : Int {
        return if (cacheMap.contains(key)) {
            val node = cacheMap[key]!!
            remove(node)
            insert(node)
            node.value
        } else return -1
    }

    fun put(key: Int, value: Int) {
        if (cacheMap.contains(key)) {
            val node = cacheMap[key]!!
            remove(node)
            node.value = value
            insert(node)
        } else {
            if (count == capacity) {
                remove(leastNode.next!!)
                count--
            }
            val newNode = LRUNode(key, value)
            insert(newNode)
            count++
        }
    }

    fun remove(node: LRUNode) {
        node.prev?.let {
            val prev = node.prev
            if (node.next == null) {

            } else {
                prev!!.next= node.next
                node.next!!.prev = prev
            }

            cacheMap.remove(node.key)
        }
    }

    fun insert(node: LRUNode) {
        val prev = mostNode.prev
        prev!!.next = node
        node.next = mostNode
        mostNode.prev = node
        node.prev = prev
        cacheMap[node.key] = node
    }

    fun printCache() {
        var currentNode : LRUNode? = leastNode
        println("Begin printing cache")
        while (currentNode != null) {
            println("${currentNode.key}, ${currentNode.value}")
            currentNode = currentNode.next
        }
        println("End printing cache")
    }


}

data class LRUNode(val key: Int, var value: Int = 0, var prev: LRUNode? = null, var next: LRUNode? = null){
    override fun toString(): String {
        return key.toString()
    }
}