package linkedList;

class Main {
	
	public static void main(String[] args) {
		Node ob = new Node(1);

		System.out.println("First Node: " + ob.data);

		ob.push(2);

		System.out.println("Second Node: " + ob.next.data);

		ob.push(3);

		System.out.println("Third Node: " + ob.next.next.data);

		ob.push(100);

		System.out.println("Fourth Node: " + ob.next.next.next.data);

		ob.pushFront(45);

		System.out.println("New First Node: " + ob.data);

	}
}