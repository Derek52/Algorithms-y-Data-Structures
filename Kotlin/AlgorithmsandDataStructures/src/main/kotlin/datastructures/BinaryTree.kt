package datastructures

class BinaryTree {
    var root : BinaryNode? = null

    fun add(item: Int) {
        if (root == null) {
            root = BinaryNode(item)
        } else {
            root?.let { head ->
                var currentNode = head

                while(true) {
                    if (item < currentNode.value) {
                        if (currentNode.leftChild == null) {
                            currentNode.leftChild = BinaryNode(item)
                            //println("Adding $item as left child of ${currentNode.value}")
                            return
                        } else {
                            currentNode = currentNode.leftChild!!
                        }
                    } else {
                        if (currentNode.rightChild == null) {
                            currentNode.rightChild = BinaryNode(item)
                            //println("Adding $item as right child of ${currentNode.value}")
                            return
                        } else {
                            currentNode = currentNode.rightChild!!
                        }
                    }
                }
            }

        }
    }

    fun isPresent(item: Int) : Boolean{
        root?.let { r ->
            var currentNode = r

            while(currentNode.value != item) {
                if (currentNode.value > item) {
                    if (currentNode.leftChild == null) {
                        return false
                    } else {
                        currentNode = currentNode.leftChild!!
                    }
                } else {
                    if (currentNode.rightChild == null) {
                        return false
                    } else {
                        currentNode = currentNode.rightChild!!
                    }
                }
            }
            if (currentNode.value == item) {
                return true
            }
        }
        return false
    }

    fun delete(item: Int) {

    }

    fun min() : Int? {
        if (root != null) {
            var currentNode = root!!
            while(currentNode.leftChild != null) {
                currentNode = currentNode.leftChild!!
            }
            return currentNode.value
        } else {
            return null
        }
    }

    fun max() : Int? {
        if (root != null) {
            var currentNode = root!!
            while(currentNode.rightChild != null) {
                currentNode = currentNode.rightChild!!
            }
            return currentNode.value
        } else {
            return null
        }
    }

    fun printTree(node: BinaryNode) {
        print(" ${node.value} ")
        if (node.leftChild == null && node.rightChild == null) {
            return
        }

        if (node.leftChild == null) {
            printTree(node.rightChild!!)
            return
        }

        if (node.rightChild == null) {
            printTree(node.leftChild!!)
            return
        }
        println()
        print(" ${node.leftChild!!.value} ")
        print(" ${node.rightChild!!.value} ")
        printTree(node.leftChild!!)
        printTree(node.rightChild!!)
        println()
    }

    fun clear() {
        root = null
    }

    fun isEmpty() : Boolean {
        return root == null
    }
}

class BinaryNode(val value: Int, var leftChild: BinaryNode? = null, var rightChild: BinaryNode? = null)