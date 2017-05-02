package linkedList;

public class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	LinkedList(int val) {
		head = new Node(val);
	}

	void push(int val) {
		if (this.head == null) {
			this.head = new Node(1);
		}

		Node ob = head;
		while (ob.next != null) {

			if (ob.next == null) {
				ob.next = new Node(val);
			}

			ob = ob.next;
		}
		ob.next = new Node(val);
	}

	void pushFront(int val) {
		Node ob = new Node(val);
		ob.next = head;
		
		head = ob;
	}

	int pop() {
		int val = head.data;
		head = head.next;
		return val;
	}

	int popBack() {
		Node ob = head;
		int val;
		while (ob.next.next != null) {
			ob = ob.next;
		}
		val = ob.next.data;
		ob.next = null;
		return val;
	}

	boolean remove(int x) {

		Node ob = head;
		boolean flag = false;

		// if (head.data == x) {
		// 	head = head.next;
		// }

		// while (ob.next != null) {

		// 	if (ob.next.data == x) {

		// 		if (ob.next.next == null) {
		// 			ob.next = null;
		// 		}
		// 		else {
		// 			ob.next = ob.next.next;
		// 		}
				
		// 		flag = true;
		// 	}
		// 	ob = ob.next;
		// }

		while (ob.next != null) {


			if (ob.next.data == x && ob.next.next == null) {
				ob.next = null;
				return true;
			}

			else if (ob.next.data == x) {
				ob.next = ob.next.next;
				return true;
			}

			ob = ob.next;
		}

		return false;
	}

	boolean find(int x) {

		Node ob = head;

		if (head.data == x) {
			return true;
		}

		while (ob.next != null) {

			if (ob.next.data == x) {
				return true;
			}
			ob = ob.next;
		}
		return false;
	}

	int length() {
		Node ob = head;
		int count = 1;

		while (ob.next != null) {
			count += 1;
			ob = ob.next;
		}
		return count;
	}

	int getAtIndex(int x) {
		Node ob = head;
		if (x == 0) {
			return head.data;
		}

		for (int i = 0; i < x; i++, ob = ob.next) {
			
		}

		return ob.data;
	}

	void printer() {
		Node ob = head;
		while (ob.next != null) {

			System.out.print(ob.data + "\t");
			ob = ob.next;
		}
		System.out.println(ob.data);
	}

}