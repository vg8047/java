import java.util.*;

class Linkedlistmethod{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);

		ll.add(30);
		ll.add("vighnesh");

		System.out.println(ll);

		ll.addFirst(5);

		System.out.println(ll);

		ll.addLast(50);

		System.out.println(ll);

                 
		System.out.println(ll.getFirst());

		System.out.println(ll.getLast());

		System.out.println(ll);

		System.out.println(ll.removeLast());

		System.out.println(ll.removeFirst());
                
		System.out.println(ll);

		System.out.println(ll.peekFirst());

		System.out.println(ll.peekLast());

		System.out.println(ll);

		System.out.println(ll.pollFirst());

		System.out.println(ll.pollLast());

		System.out.println(ll);

	}
}
