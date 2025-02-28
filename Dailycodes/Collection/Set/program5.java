import java.util.*;

class Demo{

	public static void main(String[] args){

		Set  hs = new LinkedHashSet();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(-40);
		hs.add(50);
		hs.add("om");

		System.out.println(hs);

		System.out.println(hs.remove(20));

		System.out.println(hs.contains(30));

		System.out.println(hs.size());

		hs.clear();

		System.out.println(hs);

	}
}
