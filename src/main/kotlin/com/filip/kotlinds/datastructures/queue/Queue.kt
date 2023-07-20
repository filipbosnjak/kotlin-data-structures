package com.filip.kotlinds.datastructures.queue

class Queue<T>: QueueI<T> {

    private val list = arrayListOf<T>()
    override fun enqueue(e: T): T {
        list.add(e)
        return e
    }

    override fun dequeue(): T? {
        return list.removeFirstOrNull()
    }

    override fun peek(): T? {
        return list.getOrNull(0)
    }

    override fun size(): Int {
        return list.size
    }

    override fun toString(): String {
        return list.toString()
    }
}

fun <T> ArrayList<T>.prepend(element: T) = this.add(0, element)