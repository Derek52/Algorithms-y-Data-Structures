package datastructures.linkedlist

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LRUCacheTest {

    @Test
    fun lruCacheTest() {
        val lruCache = LRUCache(2)

        lruCache.printCache()
        lruCache.put(1, 1)
        lruCache.printCache()
        lruCache.put(2, 2)
        lruCache.printCache()
        println("GET 1")
        lruCache.get(1).shouldBe(1)
        println("FINISH GET 1")
        lruCache.printCache()
        println("PUT 3")
        lruCache.put(3, 3)
        println("FINISH PUT 3")
        lruCache.printCache()
        println("GET 2")
        lruCache.get(2).shouldBe(-1)
        println("FINISH GET 2")
        lruCache.printCache()
        lruCache.printCache()
        lruCache.put(4, 4)
        lruCache.printCache()
        lruCache.get(1).shouldBe(-1)
        lruCache.printCache()
        lruCache.get(3).shouldBe(3)
        lruCache.printCache()
        lruCache.get(4).shouldBe(4)
        lruCache.printCache()
    }

    @Test
    fun lruCacheTest2() {
        val lruCache = LRUCache(2)

        lruCache.put(2, 1)
        lruCache.put(2, 2)
        lruCache.get(2).shouldBe(2)
        lruCache.put(1, 1)
        lruCache.put(4, 1)
        lruCache.get(2).shouldBe(-1)
    }

    @Test
    fun modTest() {

    }
}