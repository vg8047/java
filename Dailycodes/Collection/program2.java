import java.util.*;

class Listmethod {

	public static void main(String[] args){

		List al = new ArrayList();

		al.add(10);

		al.add(20);

		al.add("om");

		al.add("Vighnesh");

		al.add("kanha");

		al.add(30.5);

		System.out.println(al);

		al.add(3,"vikas");
		al.add(4,"Niraj");

		System.out.println(al);

		System.out.println(al.contains("vikas"));

		System.out.println(al.contains(20));

		System.out.println(al.get(3));

		System.out.println(al.isEmpty());

		System.out.println(al.remove(7));

		System.out.println(al.remove("vikas"));

		System.out.println(al);

		al.set(3,"Badhe");

		System.out.println(al);

		System.out.println(al.size());

		al.clear();

		System.out.println(al);


	}
}
