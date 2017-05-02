package linkedList;

class Main {
	
	public static void main(String[] args) {
		LinkedList ob = new LinkedList(22);
		// ob.printer();
		ob.push(2);
		// ob.printer();
		ob.push(3);
		// ob.printer();
		ob.push(100);
		ob.printer();
		

		ob.pushFront(45);
		ob.printer();


		System.out.println(ob.pop());
		ob.printer();

		System.out.println(ob.popBack());
		ob.printer();

		System.out.println(ob.remove(35));
		ob.printer();

		System.out.println(ob.find(22));

		System.out.println(ob.length());

		System.out.println(ob.getAtIndex(2));


	}
}