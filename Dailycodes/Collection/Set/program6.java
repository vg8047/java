import java.util.*;

class Demo{

	public static void main(String[] args){

		ArrayList al  = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		HashSet hs = new HashSet(al);

		System.out.println(hs);

                al.addAll(hs);

		System.out.println(al);

	}
}
