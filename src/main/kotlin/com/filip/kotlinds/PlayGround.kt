package com.filip.kotlinds

import com.filip.kotlinds.datastructures.queue.Queue
import com.filip.kotlinds.datastructures.queue.prepend

fun main(args: Array<String>) {

    val queue: Queue<String> = Queue()

    queue.enqueue("first")
    queue.enqueue("second")
    queue.enqueue("third")

    println(queue.toString()) // [first, second, third]

    println(queue.peek()) // first

    println(queue.dequeue()) // first

    println(queue.toString()) // [second, third]

    println(queue.size())

}
