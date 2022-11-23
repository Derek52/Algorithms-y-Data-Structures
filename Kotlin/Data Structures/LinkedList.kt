class LinkedList() {
	var head : Node? = null
	var currentNode : Node? = null

	fun add(item: Int) {
		if (head == null) {
			head = Node(item)
			currentNode = head
		} else {
			currentNode!!.next =  Node(item)
		}
	}

	fun remove(item: Int) {
		if (head != null) {
			val h = head!!
			if (h.item == item) {
				head = h.next
			}
			var previousNode = h
			var tempNode = h.next
			while(tempNode!!.next != null) {
				if (tempNode.item == item) {
					previousNode.next = tempNode.next
				}
				previousNode = tempNode
			}
		}
	}

	fun find(item: Int) : Node? {
		var node = head!!
		while(node.next != null) {
			if (node.item == item) {
				return node
			}
		}
		return null
	}

	fun addFirst(item: Int) {
		if (head != null) {
			val h = head!!
			if (h.next != null) {
				val tempNode = h.next
				head = Node(item)
				head!!.next = tempNode
			}
		}
	}

	fun deleteFirst() {
		if (head != null) {
			val h = head
			if (h != null) {
				val tempNode = h.next
				head = tempNode
			}
		}
	}

	fun clear() {
		head = null
		currentNode = null
	}
}

class Node(val item: Int, var next: Node? = null) {
}
