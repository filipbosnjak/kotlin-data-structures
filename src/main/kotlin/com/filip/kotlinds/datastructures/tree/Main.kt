package com.filip.kotlinds.datastructures.tree

fun main(args: Array<String>) {
    val root: Node<String> = Node("a")
    val tree: Tree<String> = Tree(root);

    tree.root.left = Node("b")
    tree.root.right = Node("c")
    tree.root.right?.right = Node("a")


    println(root.value)
    println(root.left?.value)
    println(root.right?.value)
    println(tree.height())
}