import java.util.*;
class LinkedListDemo{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		ll.add(34);
		ll.add(23);
		ll.add(22);
		ll.add(13);
		

		System.out.println(ll);

               ll.addFirst(45);
                ll.addLast(89);

		
		System.out.println(ll);

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		System.out.println(ll);

		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());

		System.out.println(ll.peekFirst());

		System.out.println(ll.peekLast());


		System.out.println(ll);

		System.out.println(ll.pollFirst());

		System.out.println(ll);




		
	}
}
