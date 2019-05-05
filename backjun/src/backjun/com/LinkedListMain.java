package backjun.com;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
	
		numbers.addLast(5);
		numbers.addLast(10);
		numbers.addLast(15);
		numbers.addLast(20);
		LinkedList.ListIterator i = numbers.listIterator();
		i.add(5);
		i.next();
		i.add(15);
		
	}
}
