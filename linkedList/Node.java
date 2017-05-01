package linkedList;

public class Node {
	int data;
	Node next;

	Node() {
		data = 0;
	}

	Node(int val) {
		data = val;
	}

	Node push() {
		return next;
	}

	Node push(int val) {
		next = new Node(val);
		return next;
	}

	Node pushFront(int val) {
		
	}

	// pop(int val) {

	// }
}