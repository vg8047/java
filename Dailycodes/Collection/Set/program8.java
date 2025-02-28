import java.util.*;

class SetDemo{

	public static void main(String[] args){


		SortedSet ss = new TreeSet();

		ss.add("ashish");
		ss.add("Aarav");
		ss.add(10);
		ss.add(20);        // same type of entity require to sort the list othrerwise class cast exception occur
		ss.add("Belkar");
		ss.add("belkar");

		System.out.println(ss);

	}
}
