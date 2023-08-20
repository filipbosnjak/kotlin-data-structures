package com.filip.kotlinds.datastructures.tree

import kotlin.math.max

class Tree<T>(
    var root: Node<T>
) {
    fun height(node: Node<T>? = root): Int {
        if(node == null) {
            return 0
        } else {
            return max(height(node.left), height(node.right)) + 1
        }

    }
}