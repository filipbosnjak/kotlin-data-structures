package com.filip.kotlinds.queue

import com.filip.kotlinds.datastructures.queue.Queue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class QueueTest {

    private lateinit var queue: Queue<Int>

    @BeforeEach
    fun setUp() {
        queue = Queue()
    }

    @Test
    fun testEnqueue() {
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        assertEquals("[1, 2, 3]", queue.toString())
        assertEquals(3, queue.size())
    }

    @Test
    fun testDequeue() {
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        val dequeuedValue = queue.dequeue()
        assertEquals(1, dequeuedValue)
        assertEquals("[2, 3]", queue.toString())
        assertEquals(2, queue.size())
    }

    @Test
    fun testDequeueEmptyQueue() {
        val dequeuedValue = queue.dequeue()
        assertNull(dequeuedValue)
    }

    @Test
    fun testPeek() {
        queue.enqueue(10)
        queue.enqueue(20)

        val peekedValue = queue.peek()
        assertEquals(10, peekedValue)
        assertEquals("[10, 20]", queue.toString())
        assertEquals(2, queue.size())
    }

    @Test
    fun testPeekEmptyQueue() {
        val peekedValue = queue.peek()
        assertNull(peekedValue)
    }

    @Test
    fun testSize() {
        assertEquals(0, queue.size())

        queue.enqueue(100)
        assertEquals(1, queue.size())

        queue.enqueue(200)
        assertEquals(2, queue.size())

        queue.dequeue()
        assertEquals(1, queue.size())
    }
}