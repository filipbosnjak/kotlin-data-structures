package com.filip.kotlinds.datastructures.queue

/**
 * Queue - FIFO structure - elements to be dequeued from the start and enqueued to the end
 */
interface QueueI<T> {

    fun enqueue(e: T): T

    fun dequeue(): T? // -> nullable because queue could potentially be empty

    fun peek(): T?

    fun size(): Int

    override fun toString(): String

    val isEmpty: Boolean
        get() = size() == 0

}