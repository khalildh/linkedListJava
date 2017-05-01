package linkedList;

public class Node {
	int data;
	Node next;

	Node() {
		data = 0;
	}

	Node(int val) {
		data = val;
		next = null;
	}

	Node push() {
		return next;
	}

	void push(int val) {
		Node ob = this;
		while (ob.next != null) {

			if (ob.next == null) {
				ob.next = new Node(val);
			}

			ob = ob.next;
			System.out.println(next);
		}

		if (ob.next == null) {
				ob.next = new Node(val);
		}
	}

	void pushFront(int val) {
		Node ob = this;

		this = new Node(val);

		this.next = ob;
	}
}