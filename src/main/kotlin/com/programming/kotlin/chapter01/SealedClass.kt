package com.programming.kotlin.chapter01

sealed class IntBinaryTree { // 봉인클래스 선언
    class EmptyNode: IntBinaryTree() // 내부 중첩 클래스
    class IntBinaryTreeNode(val left: IntBinaryTree, val value: Int, val right: IntBinaryTree) : IntBinaryTree() // 내부 중첩 클래스
}

fun main(args: Array<String>) {
    val tree = IntBinaryTree.IntBinaryTreeNode(
        IntBinaryTree.IntBinaryTreeNode(
            IntBinaryTree.EmptyNode(),
            1,
            IntBinaryTree.EmptyNode()),
        10,
        IntBinaryTree.EmptyNode()
    )
}
